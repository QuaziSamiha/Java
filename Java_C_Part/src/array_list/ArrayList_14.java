package array_list;  // checking two ArrayList is equal or not using equals() method

import java.util.ArrayList;

public class ArrayList_14 {

    public static void main(String[] args) {

        ArrayList<Integer> object_1 = new ArrayList<>();
        ArrayList<Integer> object_2 = new ArrayList<>();
        ArrayList<Integer> object_3 = new ArrayList<>();

        // adding elements using two types add() method
        object_1.add(10);  // it will add in index 0
        object_1.add(20);  // it will add in index 1
        object_1.add(30);  // it will add in index 2
        object_1.add(40); // it will add in index 3
        System.out.println("object_1 : " +object_1);

        object_2.add(11);
        object_2.add(22);
        object_2.add(33);
        object_2.add(44);
        System.out.println("object_2 : " +object_2);

        // adding all elements using two types addAll() method
        object_3.addAll(object_1);
        System.out.println("object_3 : " +object_3);

        // checking equal or not
        boolean variable;

        variable = object_1.equals(object_2);
        System.out.println("ArrayList_1 is equal to ArrayList_2 : " +variable);

        variable = object_1.equals(object_3);
        if(variable == true){
            System.out.println("ArrayList_1 is equal to ArrayList_3");
        }
        else {
            System.out.println("ArrayList_1 is not equal to ArrayList_3");
        }
    }
}
