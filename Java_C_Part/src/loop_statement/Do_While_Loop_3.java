package loop_statement;  // iteration statement

import java.util.Scanner;

public class Do_While_Loop_3 {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in); // creating object for calling method of Scanner class

        int variable;

        System.out.println("Enter 0 to exit"); // print information for exiting program

        do {
            System.out.print("Enter any integer : ");
            variable = object.nextInt(); // taking integer input from user
            System.out.println("Entered : " +variable);
        }while (variable != 0); // condition for exiting from program

        System.out.println("\nEnd Program");
    }
}

