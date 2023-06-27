package exception_handling;  // finally block using (4:27pm,11 January,2020 & 11:23am,13 August,2020)

// exception is not handled

import java.util.Scanner;

public class ExceptionHandling_17 {
    public static void main(String[] args) {

        try {

            Scanner object = new Scanner(System.in);

            System.out.print("Enter an integer  n1 : ");
            int n1 = object.nextInt();
            System.out.print("Enter the divisor n2 : ");
            int n2 = object.nextInt();

            int n3 = n1 / n2; // if we divided by zero,then ArithmeticException type exception will occur
            System.out.println("n1/n2 : " + n3);

            System.out.println("Rest of the code"); // it will not execute if exception is created
            System.out.println("Program continued"); // it will not execute if exception is created
        }
        catch (NullPointerException r) { // exception is not handled (since exception type is not appropriate)

            System.out.println("\ndividing by zero is not possible !!");
        }
        finally {

            // finally block will execute instead of not handling exception
            System.out.println("\nfinally block");
        }

        System.out.println("\nafter try, catch and finally block"); // it will not execute if exception is created
    }
}
