package exception_handling;  // finally block using (4:27pm,11 January,2020 & 11:23am,13 August,2020)

// finally block is a block that is used to execute important code such as closing file etc.
// finally block is always executed whether exception is handled or not.

import java.util.Scanner;

public class ExceptionHandling_15 {
    public static void main(String[] args) {

        try {

            Scanner object = new Scanner(System.in);

            System.out.print("Enter an integer  n1 : ");
            int n1 = object.nextInt();
            System.out.print("Enter the divisor n2 : ");
            int n2 = object.nextInt();

            int n3 = n1 / n2; // if we divided by zero,then unchecked exception will occur
            System.out.println("n1/n2 : " + n3);

            System.out.println("Rest of the code");
            System.out.println("Program continued");

            // try block must be followed by either catch or finally block.
        }
        catch (ArithmeticException r) {
            // When an exception occurs, that exception is handled by catch block.It must be used after the try block only.

            System.out.println("\ndividing by zero is not possible !!");
        }
        finally { // finally block should be last block of execution in the program.

            System.out.println("\nfinally block");

            /*
            At least one block either catch or finally,must be associated with each try block.In case you
            have both catch block and a finally block with the same try block,you must put the finally block
            after all the catch blocks. For each try block there can be zero or more catch blocks, but only one catch block.
            */
        }

        /*
        The finally block will not be executed if program exits(either by calling System.exit() or by
        causing by a fatal error that causes the process to abort).
        */

        System.out.println("\nafter try, catch and finally block");
    }
}
