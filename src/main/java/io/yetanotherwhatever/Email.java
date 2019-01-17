package io.yetanotherwhatever;

import java.util.*;

import com.google.api.services.gmail.model.Message;
import com.google.api.services.gmail.model.MessagePart;
import com.google.api.services.gmail.model.MessagePartHeader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by achang on 1/8/2019.
 */
public class Email {

    private static final Logger logger = LogManager.getLogger(Email.class);

    private String subject;
    private String body;
    private String from;
    private String to;
    private Map<String, String> headers;

    private Calendar creationDate = new GregorianCalendar();

    private String id;

    public Email()
    {

    }

    public Email(Message m)
    {
        MessagePart pl = m.getPayload();

        if (pl == null) {

            logger.error("Null email payload encountered.");
            throw new NullPointerException();
        }

        List<MessagePartHeader> headers = pl.getHeaders();
        this.headers = new HashMap();
        headers.stream().forEach(h -> {
            this.headers.put(h.getName(), h.getValue());

            if ("Subject".equalsIgnoreCase(h.getName()))
            {
                this.subject = h.getValue();
            }

            if ("To".equalsIgnoreCase(h.getName()))
            {
                this.to = h.getValue();
            }

            if ("From".equalsIgnoreCase(h.getName()))
            {
                this.from = h.getValue();
            }
        });

        this.body = new String(pl.getBody().decodeData());

        this.id = m.getId();

        this.creationDate.setTimeInMillis(m.getInternalDate());
    }

    public Calendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Calendar c) {
        this.creationDate = c;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }
}
