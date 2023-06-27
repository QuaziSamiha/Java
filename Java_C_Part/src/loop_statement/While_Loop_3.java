package loop_statement;  // iteration statement

import java.util.Scanner;

public class While_Loop_3 {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in); // creating object for calling method of Scanner class

        System.out.println("Enter 0 to exit"); // print information for exiting program

        while (true) // true means it will continue until the condition of it statement is true
        {
            int variable;
            System.out.print("Enter any integer : ");
            variable = object.nextInt(); // taking integer input from user

            if (variable == 0) // condition for exiting from program
            {
                System.out.println("\n Program End");
                break;
            }

            System.out.println("Entered : " + variable);

        }
    }
}