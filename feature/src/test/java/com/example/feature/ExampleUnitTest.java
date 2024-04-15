package com.example.feature;

import com.example.core.MyClass;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testResources() throws IOException {
        ClassLoader classLoader = MyClass.class.getClassLoader();
        Assert.assertNotNull(classLoader);

        InputStream is = classLoader.getResourceAsStream("test.txt");
        InputStreamReader streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
        try (BufferedReader reader = new BufferedReader(streamReader)) {
            String line = reader.readLine();
            assertEquals("1", line);
        }
    }
}