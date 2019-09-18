package com.stackroute;

import org.junit.*;

import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FilterStringLambdaStreamDemoTest {
    private static FilterStringLambdaStreamDemo filterStringLambdaStreamDemo;

    @BeforeClass
    public static void setUp() throws Exception {
        filterStringLambdaStreamDemo = new FilterStringLambdaStreamDemo();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        filterStringLambdaStreamDemo = null;
    }

    @Test
    public void testFilter() throws Exception{

        List<String> words = Arrays.asList("ava", "apple", "adam", "abc", "abcd");
        List<String> expected  = Arrays.asList("ava","abc");
        List<String> actual = filterStringLambdaStreamDemo.search(words);
        Assert.assertEquals(actual,expected);
    }
}