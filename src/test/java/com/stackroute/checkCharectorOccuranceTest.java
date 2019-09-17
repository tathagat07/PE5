package com.stackroute;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class checkCharectorOccuranceTest {

    private static checkCharectorOccurance checkCharectorOccurance;
    @BeforeClass
    public static void setUp() throws Exception {
        checkCharectorOccurance = new checkCharectorOccurance();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        checkCharectorOccurance = null;
    }

    @Test
    public void checkAppearance() {
        String expected="{a : true, b : false, c : true, d : false}";
        String arr[] = {"a","b","c","d","a","c","c"};
        String actual=checkCharectorOccurance.checkAppearance(String.join(" ",arr)).replaceAll("="," : ");
        assertEquals(expected,actual);
    }

    @Test
    public void checkAppearanceNull() {
        String actual=checkCharectorOccurance.checkAppearance(null);
        assertNull(actual);
    }
}