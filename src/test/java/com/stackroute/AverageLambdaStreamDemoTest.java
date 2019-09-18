package com.stackroute;

import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AverageLambdaStreamDemoTest {
     private static AverageLambdaStreamDemo averageLambdaStreamDemo;
    @BeforeClass
    public static void setUp() throws Exception {
        averageLambdaStreamDemo = new AverageLambdaStreamDemo();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        averageLambdaStreamDemo = null;
    }

    @Test
    public void testAverage() throws Exception{
        final List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 22);
        double expected  = 11.00;
        double actual = averageLambdaStreamDemo.average(primes);
        Assert.assertEquals(expected,actual,0.00);
    }
  @Test
    public void testNotNull() throws Exception{
      final List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 22);
      double actual = averageLambdaStreamDemo.average(primes);
      Assert.assertNotNull(actual);
  }

}