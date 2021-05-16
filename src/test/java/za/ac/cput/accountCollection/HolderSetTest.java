package za.ac.cput.accountCollection;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class HolderSetTest {
    @Test
    public void testAccountTreeSet () {
// Creating  a tree set.
        Set<String> accountSet = new TreeSet<String>();
        // Add elements to the tree set.
        System.out.println("<------ Add elements to the tree set ------>");
        accountSet.add("Mandla");
        accountSet.add("Vukosi");
        accountSet.add("Rhandzu");
        for (String element : accountSet) {
            System.out.println(element);
        }


        //Test case for Add
        System.out.println("<------ Test case for Add ------>");
        int actual = accountSet.size();
        int expected = 3;
        assertEquals(expected, actual);
        System.out.println("What is expected = " + expected + "\n Actual = " + actual);

        //removing elements in the tree set an adding new elements
        Set<String> accountSet1 = new TreeSet<String>();
        System.out.println("<------ New added elements to the tree set removing the old set ------>");
//        accountSet1.add("Joe");
//        accountSet1.add("Jahmeh");
        accountSet1.add("John");
        Set<String> newAccountSet = new HashSet<String>(accountSet1);
        newAccountSet.removeAll(accountSet);
        System.out.println(newAccountSet);

        //Test Case for remove
        System.out.println("<------ Test case for remove ---->");
        int actualR = accountSet1.size();
        int expectedR = 1;
        assertEquals(expectedR, actualR);
        System.out.println("What is expected = " + expectedR + "\n Actual = " + actualR + "\n");

        //finding elements in the tree set
        System.out.println("<------ Finding elements in a new Tree Set ------>");
        if (accountSet1.contains("John")) {
            System.out.println("New set contains John = " + accountSet1.contains("John"));
        }

//        //Test Case for Find
//        for (int i = 0; i < accountSet1; i++){
//            assertThat(accountSet.contains(accountSet1[i]), is(true));
//         }


    }


    }