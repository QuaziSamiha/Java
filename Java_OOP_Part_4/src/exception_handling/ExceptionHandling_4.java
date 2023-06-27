package exception_handling;  // handling exception using try and catch block (12:01pm,11 January,2020 and 10:05am,12 August,2020)

import java.util.Scanner;

public class ExceptionHandling_4 {
    public static void main(String[] args) {

        try {  // try block is used to enclose the code that might throw an exception.It must be used within the method.

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
        catch (ArithmeticException reference_variable) {
            // When an exception occurs, that exception is handled by catch block.It must be used after the try block only.

            System.out.println("\ndividing by zero is not possible !!"); // handling code
            // An catch statement involves declaring the type of exception you are trying to catch.
        }

        System.out.println("\nafter try and catch block");
    }
}

/*
Syntax :

try
{
  code that may throw exception

}catch(ExceptionName e){  //here e is a reference variable
  catch block
}
*/