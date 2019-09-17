package com.stackroute;

import org.junit.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class modifyMapElementTest {
    private static modifyMapElement modifyMapElement;
    @BeforeClass
    public static void setUp() throws Exception {
        modifyMapElement = new modifyMapElement();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        modifyMapElement = null;
    }

    @Test
    public void testModifyMapElement1() {
        String expexted="{val2=java, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","java");
        map.put("val2","c++");
        String actual=modifyMapElement.switchValue(map);
        assertEquals(expexted,actual);
    }

    @Test
    public void testModifyMapElement2() {

        String expexted="{val2=mars, val1= }";
        Map<String, String> map=new HashMap<>();
        map.put("val1","mars");
        map.put("val2","saturn");
        String actual=modifyMapElement.switchValue(map);
        assertEquals(expexted,actual);

    }

    @Test
    public void rotateValueNull() {

        String actual=modifyMapElement.switchValue(null);
        assertNull(actual);
    }
}