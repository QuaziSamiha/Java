package array_list;  // displaying array-list

import java.util.ArrayList;

public class ArrayList_2 {

    public static void main(String[] args) {

        ArrayList<Integer> object = new ArrayList<>();

        System.out.println("size before adding elements : " +object.size());

        // adding elements using two types add() method
        object.add(10);  // it will add in index 0
        object.add(11);  // it will add in index 1
        object.add(21);  // it will add in index 2

        object.add(3,66); // it will add in index 3

        System.out.println(object); // for displaying array-list

        System.out.println("size after adding elements : " +object.size());
    }
}
