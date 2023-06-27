package array_list;  // find out index number of a specific element

import java.util.ArrayList;

public class ArrayList_10 {

    public static void main(String[] args) {

        ArrayList<Integer> object = new ArrayList<>();

        // adding elements using two types add() method
        object.add(10);  // it will add in index 0
        object.add(11);  // it will add in index 1
        object.add(21);  // it will add in index 2
        object.add(3, 66); // it will add in index 3

        int variable = object.indexOf(11);
        System.out.println("index of 11 in ArrayList is : " +variable);
    }
}
