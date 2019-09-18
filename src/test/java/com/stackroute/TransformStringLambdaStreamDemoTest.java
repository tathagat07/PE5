package com.stackroute;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class TransformStringLambdaStreamDemoTest {
    private static TransformStringLambdaStreamDemo transformStringLambdaStreamDemo;
    @BeforeClass
    public static void setUp() throws Exception {
      transformStringLambdaStreamDemo = new TransformStringLambdaStreamDemo();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        transformStringLambdaStreamDemo = null;
    }

    @Test
    public void testEvenOdd() throws Exception{
         List<Integer> numbers = Arrays.asList(2, 3, 4, 7, 11, 13, 19, 22);
         String expected = ("e2,o3,e4,o7,o11,o13,o19,e22");
         String actual = transformStringLambdaStreamDemo.getString(numbers);
         Assert.assertEquals(actual,expected);
    }
}