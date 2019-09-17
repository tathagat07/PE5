    package com.stackroute;

    import org.junit.*;

    import java.util.ArrayList;

    import static org.junit.Assert.*;

    public class updateArrayListTest {
         private static updateArrayList updateArrayList;
        @BeforeClass
        public static void setUp() throws Exception {
            updateArrayList = new updateArrayList();
        }

        @AfterClass
        public static void tearDown() throws Exception {
            updateArrayList = null;
        }

        @Test
        public void testUpdateArrayList() throws Exception{
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("Apple");
            arrayList.add("Grape");
            arrayList.add("Melon");
            arrayList.add("Berry");

            ArrayList<String> expected = new ArrayList<String>();
            expected.add("Kiwi");
            expected.add("Grape");
            expected.add("Mango");
            expected.add("Berry");

            ArrayList<String> actual = updateArrayList.update(arrayList);
            Assert.assertEquals(actual,expected);
        }

        @Test
        public void testEmptyArrayList() throws Exception{
            ArrayList<String> arrayList = new ArrayList<String>();
            arrayList.add("Apple");
            arrayList.add("Grape");
            arrayList.add("Melon");
            arrayList.add("Berry");
            ArrayList<String> expected = new ArrayList<String>();
            ArrayList<String> actual = updateArrayList.Remove(arrayList);


        }
    }