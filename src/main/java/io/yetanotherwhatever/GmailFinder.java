package io.yetanotherwhatever;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.extensions.java6.auth.oauth2.AuthorizationCodeInstalledApp;
import com.google.api.client.extensions.jetty.auth.oauth2.LocalServerReceiver;
import com.google.api.client.googleapis.auth.oauth2.GoogleAuthorizationCodeFlow;
import com.google.api.client.googleapis.auth.oauth2.GoogleClientSecrets;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.util.store.FileDataStoreFactory;
import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.GmailScopes;
import com.google.api.services.gmail.model.ListThreadsResponse;
import com.google.api.services.gmail.model.Message;
import com.google.api.services.gmail.model.Thread;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by achang on 1/8/2019.
 */
public class GmailFinder implements IEmailFinder{

    private static final String USER = "me";
    private static final String APPLICATION_NAME = "My Gmail Searcher";
    private static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();
    private static final String TOKENS_DIRECTORY_PATH = "mytokens";
    //If modifying these scopes, delete your previously saved tokens/ folder.
    private static final List<String> SCOPES = Collections.singletonList(GmailScopes.GMAIL_READONLY);
    private static final String CREDENTIALS_FILE_PATH = "/credentials.json";

    private static final Logger logger = LogManager.getLogger(GmailFinder.class);

    private Gmail service = null;
    IEmailProcesser processer;
    private long maxThreadResults = 0;

    public GmailFinder()
    {
    }

    /**
     * Sample taken from Gmail api java quickstart
     *
     * Creates an authorized Credential object.
     * @param HTTP_TRANSPORT The network HTTP Transport.
     * @return An authorized Credential object.
     * @throws IOException If the credentials.json file cannot be found.
     */
    private static Credential getCredentials(final NetHttpTransport HTTP_TRANSPORT) throws IOException {
        // Load client secrets.
        InputStream in = GmailFinder.class.getResourceAsStream(CREDENTIALS_FILE_PATH);
        GoogleClientSecrets clientSecrets = GoogleClientSecrets.load(JSON_FACTORY, new InputStreamReader(in));

        // Build flow and trigger user authorization request.
        GoogleAuthorizationCodeFlow flow = new GoogleAuthorizationCodeFlow.Builder(
                HTTP_TRANSPORT, JSON_FACTORY, clientSecrets, SCOPES)
                .setDataStoreFactory(new FileDataStoreFactory(new java.io.File(TOKENS_DIRECTORY_PATH)))
                .setAccessType("offline")
                .build();

        LocalServerReceiver receiver = new LocalServerReceiver.Builder().setPort(8888).build();
        return new AuthorizationCodeInstalledApp(flow, receiver).authorize("user");
    }

    private void initService()
    {
        if (null != service)
        {
            return;
        }

        try {
            // Build a new authorized API client service.
            final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
            service = new Gmail.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
                    .setApplicationName(APPLICATION_NAME)
                    .build();
        }
        catch (IOException | GeneralSecurityException e)
        {
            e.printStackTrace();
        }
    }


    @Override
    public void setEmailProcesser(IEmailProcesser processer) {
        this.processer = processer;
    }

    @Override
    public int findAndProcessEmails(String query) {

        initService();

        List<Email> emails = new ArrayList();

        List<Thread> threads;
        try {
            threads = searchThreads(query);
        }
        catch(IOException e)
        {
            e.printStackTrace();
            return 0;
        }

        threads.stream().forEach(thread -> {

            try {
                List<Message> messages = getThreadMessages(thread.getId());

                messages.stream().forEach(m -> {
                    Email e = new Email(m);
                    emails.add(e);
                    this.processer.processEmail(e);
                });
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }


        });

        return emails.size();
    }

    private boolean removeUnreadTag(Thread thread)
    {
        //TODO
        return false;
    }

    @Override
    public IEmailFinder setMaxThreadResults(long i) {
        this.maxThreadResults = i;

        return this;
    }

    private List<Thread> searchThreads(String query) throws IOException
    {
        Gmail.Users.Threads.List listRequest = service.users().threads().list(USER).setQ(query);

        if (maxThreadResults > 0)
        {
            listRequest.setMaxResults(maxThreadResults);
        }

        ListThreadsResponse response = listRequest.execute();

        List<Thread> threads = response.getThreads();

        return threads;
    }

    private List<Message>  getThreadMessages(String threadId)   throws IOException
    {
        Thread thread = service.users().threads().get(USER, threadId)
                .execute();

        List<Message> messages = thread.getMessages();

        return messages;
    }


}
