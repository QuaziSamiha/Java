package basic_knowledge; // getting input from user

import java.util.Scanner;
// Scanner is a class
// java is a package
// util is a sub-package

public class Input_1 {

    public static void main(String[] args) {

        int variable_1;

        Scanner object_name = new Scanner(System.in); // object is created for using method of Scanner class

        System.out.print("Enter an integer : ");
        variable_1 = object_name.nextInt(); // nextInt() method is used for taking integer as input
        System.out.println("Entered : " +variable_1);

        float variable_2;
        System.out.print("Enter a float number : ");
        variable_2 = object_name.nextFloat(); // nextFloat() method is used for taking float as input
        System.out.println("Entered : " +variable_2);

        double variable_3;
        System.out.print("Enter a double number : ");
        variable_3 = object_name.nextDouble(); // nextDouble() method is used for taking double as input
        System.out.println("Entered : " +variable_3);

        // nextInt(), nextFloat(), next() are Methods of Scanner class
    }
}
