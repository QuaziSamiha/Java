package array_list;  // finding a specific element in ArrayList using contains() method

import java.util.ArrayList;

public class ArrayList_9 {

    public static void main(String[] args) {

        ArrayList<Integer> object = new ArrayList<>();

        // adding elements using two types add() method
        object.add(10);  // it will add in index 0
        object.add(11);  // it will add in index 1
        object.add(21);  // it will add in index 2
        object.add(3, 66); // it will add in index 3

        boolean variable = object.contains(21);
        System.out.println("Is 21 exist in the ArrayList : " +variable);

        variable = object.contains(35);
        System.out.print("Is 35 exist in the ArrayList : ");
        if(variable == false){
            System.out.println("No");
        }
        else if(variable == true){
            System.out.println("yes");
        }
    }
}
