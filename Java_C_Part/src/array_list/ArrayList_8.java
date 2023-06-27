package array_list;  // checking array-list is empty or not

import java.util.ArrayList;

public class ArrayList_8 {

    public static void main(String[] args) {

        ArrayList<Integer> object = new ArrayList<>();

        // adding elements using two types add() method
        object.add(10);  // it will add in index 0
        object.add(11);  // it will add in index 1
        object.add(21);  // it will add in index 2
        object.add(3,66); // it will add in index 3

        boolean variable = object.isEmpty(); // isEmpty() method is used for checking array-list is empty or not
        System.out.println("ArrayList Empty : " +variable);
        System.out.println("size of ArrayList : " +object.size());

        object.clear(); // clear all elements
        variable = object.isEmpty();
        System.out.println("\nArrayList Empty : " +variable);
        System.out.println("size of ArrayList : " +object.size());
    }
}
