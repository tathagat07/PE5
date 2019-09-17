package com.stackroute;

import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class sortingWordsTest {
      private static sortingWords sortingWords;
    @BeforeClass
    public static void setUp() throws Exception {
        sortingWords = new sortingWords();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        sortingWords = null;
    }

    @Test
    public void testSortingWords() throws Exception{
        ArrayList<String> list =new ArrayList<String>();
        list.add("Harry");
        list.add("Olive");
        list.add("Alice");
        list.add("Bluto");
        list.add("Eugene");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Eugene");
        expected.add("Harry");
        expected.add("Olive");

        ArrayList<String> actual = sortingWords.sort_array(list);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testNotNull() throws Exception{
        ArrayList<String> list =new ArrayList<String>();
        list.add("Harry");
        list.add("Olive");
        list.add("Alice");
        list.add("Bluto");
        list.add("Eugene");
        ArrayList<String> actual = sortingWords.sort_array(list);
        Assert.assertNotNull(actual);
    }

    @Test
    public void notEquals() {
        ArrayList<String> list =new ArrayList<String>();
        list.add("Harry");
        list.add("Olive");
        list.add("Alice");
        list.add("Bluto");
        list.add("Eugene");

        ArrayList<String> expected = new ArrayList<String>();
        expected.add("Alice");
        expected.add("Bluto");
        expected.add("Harry");
        expected.add("Eugene");
        expected.add("Olive");

        ArrayList<String> actual = sortingWords.sort_array(list);
        Assert.assertNotEquals(expected,actual);
    }

}