package com.stackroute;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class studentTest {
    private static student student;
    @BeforeClass
    public static void setUp() throws Exception {
        student = new student();
    }

    @AfterClass
    public static void tearDown() throws Exception {
        student = null;
    }

    @Test
    public void testStudent() throws Exception{
        List<student> students = new ArrayList<>();
        student obj1 = new student(1, "Utkarsh", 23);
        student obj2 = new student(2, "Lalwani", 22);
        student obj3 = new student(3, "Simran", 37);
        student obj4 = new student(4, "Ajay", 22);
        student obj5 = new student(5, "Atul", 23);
        student obj6 = new student(6, "Sneha", 22);
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);
        students.add(obj6);
    }
}