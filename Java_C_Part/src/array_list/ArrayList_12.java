package array_list;  // find out element of a specific index using get() method

import java.util.ArrayList;

public class ArrayList_12 {

    public static void main(String[] args) {

        ArrayList<Integer> object = new ArrayList<>();

        // adding elements using two types add() method
        object.add(10);  // it will add in index 0
        object.add(11);  // it will add in index 1
        object.add(21);  // it will add in index 2
        object.add(3, 66); // it will add in index 3

        int variable = object.get(0);
        System.out.println("element of 0 index is : " +variable);
    }
}
