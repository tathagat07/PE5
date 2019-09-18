package com.stackroute;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.*;

public class UpperCaseLambdaStreamDemoTest {
    private static UpperCaseLambdaStreamDemo upperCaseLambdaStreamDemo;

    @BeforeClass
    public static void setUp() throws Exception {
        upperCaseLambdaStreamDemo = new UpperCaseLambdaStreamDemo();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        upperCaseLambdaStreamDemo = null;
    }

    @Test
    public void testToUpperCase() throws Exception {
        List<String> list = Arrays.asList("tathagat","kumar");
        List<String> expected = Arrays.asList("TATHAGAT","KUMAR");
        List<String> actual = UpperCaseLambdaStreamDemo.toUpperCase(list);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testNotNull() throws Exception {
        List<String> list = Arrays.asList("tathagat","kumar");
        List<String> actual = UpperCaseLambdaStreamDemo.toUpperCase(list);
        Assert.assertNotNull(actual);
    }

    @Test
    public void testNotEquals() throws Exception {
        List<String> list = Arrays.asList("tathagat","kumar");
        List<String> expected = Arrays.asList("tATHAGAT","kUMAR");
        List<String> actual = UpperCaseLambdaStreamDemo.toUpperCase(list);
        Assert.assertNotEquals(expected,actual);
    }


}