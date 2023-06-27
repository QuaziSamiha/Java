package basic_knowledge; // difference between next() and nextLine() method

import java.util.Scanner;
// Scanner is a class
// java is a package
// util is a sub-package

public class Input_2 {

    public static void main(String[] args) {

        String variable_1, variable_2;

        Scanner object_name = new Scanner(System.in); // object is created for using method of Scanner class

        // nextLine() method takes input after white space but next() method doesn't take input after space

        System.out.print("Enter a string : ");
        variable_1 = object_name.nextLine(); // nextLine() method is used for taking string as input
        System.out.println("String : " +variable_1);

        System.out.print("Enter a string : ");
        variable_2 = object_name.next(); // next() method is used for taking string as input
        System.out.println("String : " +variable_2);
    }
}
