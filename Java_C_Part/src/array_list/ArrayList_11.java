package array_list;  // replacing already existed element by a new element using set() method

import java.util.ArrayList;

public class ArrayList_11 {

    public static void main(String[] args) {

        ArrayList<Integer> object = new ArrayList<>();

        // adding elements using two types add() method
        object.add(10);  // it will add in index 0
        object.add(11);  // it will add in index 1
        object.add(21);  // it will add in index 2
        object.add(3, 66); // it will add in index 3

        System.out.print("Before replacing : ");
        System.out.println(object);

        object.set(3,50);
        System.out.print("After replacing  : ");
        System.out.println(object);
    }
}
