package array_list;  // displaying array-list

import java.util.ArrayList;
import java.util.Iterator;

// Iterator is a class

public class ArrayList_4 {

    public static void main(String[] args) {

        ArrayList<Integer> object_1 = new ArrayList<>();

        System.out.println("size before adding elements : " +object_1.size());

        // adding elements using two types add() method
        object_1.add(10);  // it will add in index 0
        object_1.add(11);  // it will add in index 1
        object_1.add(21);  // it will add in index 2

        object_1.add(3,66); // it will add in index 3

        System.out.println("ArrayList : ");
        Iterator object_2 = object_1.iterator(); // using a iterator() method of Iterator class for displaying array-list
        while (object_2.hasNext()){ // until empty the array-list
            System.out.println(object_2.next());
        }

        System.out.println("size after adding elements : " +object_1.size());
    }
}
