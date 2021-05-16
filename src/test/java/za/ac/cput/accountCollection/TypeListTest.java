package za.ac.cput.accountCollection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TypeListTest {
    @Test
    public void testAccountList () {
        // Creating a list.
        List<String> typeList = new ArrayList<>();
        //Adding elements into the list
        System.out.println("<------ Adding elements into the list ------>");
        String aH1 = "Savings";
        String aH2 = "Debit";
        String aH3 = "Fixed";
        TypeList bAcc1 = new TypeList(aH1);
        TypeList bAcc2 = new TypeList(aH2);
        TypeList bAcc3 = new TypeList(aH3);
        typeList.add(aH1);
        typeList.add(aH2);
        typeList.add(aH3);
        String aH4 = "Credit";
        TypeList bAcc4 = new TypeList(aH4);
        typeList.add(1,aH4);
        System.out.println(typeList);

        //Test case for Add
        System.out.println("\n" + "<------ Test case for Add ------>");
        int actual = typeList.size();
        int expected = 4;
        assertEquals(expected, actual);
        System.out.println("What is expected = " + expected + "\n Actual = " + actual);

        //Removing elements in the list
        System.out.println("\n"+ "<------ Removing elements in the list ------>");
        System.out.println("Array size before removing the element = " + typeList.size());
        typeList.remove(typeList.size() - 2);
        System.out.println("Array size After removing the element = " + typeList.size() + " " + typeList + "\n");

        //Test case for remove
        System.out.println("<------ Test case for remove ---->");
        int actualR = typeList.size();
        int expectedR = 3;
        assertEquals(expectedR, actualR);
        System.out.println("What is expected = " + expectedR + "\n Actual = " + actualR + "\n");

        //Finding elements in the list
        System.out.println("<------ Finding element in the  list ---->");
        System.out.println(typeList.get(2));
        System.out.println("<--List--> ");
        // Indexed for loop iteration
        for (int i = 0; i < typeList.size(); i++) {
            System.out.println(typeList.get(i));
        }

        //Test case for find
        System.out.println("\n" + "<------ Test case for find---->");
        String actualF = "" + typeList.get(2);
        String expectedF = "" + aH3;
        assertEquals(aH3, typeList.get(2));
        System.out.println("What is expected = " + expectedF + "\n Actual = " + actualF);


    }

    }