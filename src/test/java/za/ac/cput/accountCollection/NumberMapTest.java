package za.ac.cput.accountCollection;

import org.junit.jupiter.api.Test;

import java.util.Hashtable;

import static org.junit.jupiter.api.Assertions.*;

class NumberMapTest {
    @Test
public void testAccountHMap () {

    Hashtable accMap = new Hashtable();
    //Adding Elements in the Map
    System.out.println("<------ Adding Elements in the Map ------>");
    accMap.put(8, "123456");
    accMap.put(4, "112345");
    accMap.put(3, "111234");
    System.out.println(accMap);

    //Test case for add
    System.out.println("\n"+"<------ Test case for Add ------>");
    int actual = accMap.size();
    int expected = 3;
    assertEquals(expected, actual);
    System.out.println("What is expected = " + expected + "\n Actual = " + actual + "\n");

    //Removing element in the map
    System.out.println("<------ Removing elements in the map ------>");
    accMap.remove(8);
    System.out.println(accMap);

    //Test Case for remove
    System.out.println("\n"+"<------ Test case for remove ---->");
    int actual1 = accMap.size();
    int expected1 = 2;
    assertEquals(expected1, actual1);
    System.out.println( "What is expected = " + expected1+ "\n Actual = " + actual1+"\n");

    //Finding Element in the Map
    if(accMap.containsValue("112345")) {
        System.out.println(accMap.containsValue("Fixed")+" is found");
    }
    System.out.println(accMap.get(4));

    //Test Case for Find
    System.out.println("<------ Test case for find---->");
    String actualF = ""+accMap.get(4);
    String expectedF ="112345";
    assertEquals("112345", accMap.get(4));
    System.out.println( "What is expected = " + expectedF+ "\n Actual = " + actualF+"\n");

}

}