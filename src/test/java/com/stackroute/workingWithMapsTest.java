package com.stackroute;

import org.junit.*;


import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class workingWithMapsTest {
    private static workingWithMaps workingWithMaps;
    @BeforeClass
    public static void setUp() throws Exception {
        workingWithMaps = new workingWithMaps();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        workingWithMaps = null;
    }

    @Test
    public void testWorkingWithMaps() throws Exception{
            String expected="{one=5, two=2, three=2}";
            String actual=workingWithMaps.checkFrequency("one one -one___two,,three,one @three*one?two");
            assertEquals(expected,actual);
        }


}