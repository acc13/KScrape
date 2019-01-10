package io.yetanotherwhatever;

import org.junit.*;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by achang on 1/4/2019.
 */
public class RandomStuffTest {

    @Test
    public void testingHowVerifyMatchersWork()
    {
        ArrayList<String> myArrayList = Mockito.mock(ArrayList.class);
        myArrayList.add("foo");
        myArrayList.add("bar");

        verify(myArrayList, times(2)).add(any(String.class));
        verify(myArrayList, times(0)).add(eq("Andrew"));
        verify(myArrayList, times(1)).add(eq("foo"));
        verify(myArrayList, times(1)).add(eq("bar"));
    }

    @Test
    @Ignore
    public void getWorkingDirectory()
    {
        System.out.println("Working Directory = " +
                System.getProperty("user.dir"));
    }

    @Test
    public void tryLambdaStatementWithSameVariableNames()
    {
        ArrayList<String> foo = new ArrayList<>();

        foo.stream()
                .filter(bar -> !bar.isEmpty())
                .filter(bar -> bar.length() == 0)
                .forEach(bar -> bar += "1");
    }
}
