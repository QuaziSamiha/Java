package array_list;  // sorting ArrayList in ascending order

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_15 {

    public static void main(String[] args) {

        ArrayList<Integer> object = new ArrayList<>();

        // adding elements
        object.add(12);
        object.add(-3);
        object.add(28);
        object.add(9);
        object.add(36);
        object.add(3);
        object.add(-10);
        object.add(10);

        System.out.println("Before sorting : " +object);

        Collections.sort(object);  // sorting ArrayList

        System.out.println("After sorting  : " +object);
    }
}
