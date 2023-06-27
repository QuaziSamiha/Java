package exception_handling;  // finally block using (4:27pm,11 January,2020 & 11:23am,13 August,2020)

// exception is handled

import java.util.Scanner;

public class ExceptionHandling_16 {
    public static void main(String[] args) {

        try {

            Scanner object = new Scanner(System.in);

            System.out.print("Enter an integer  n1 : ");
            int n1 = object.nextInt();
            System.out.print("Enter the divisor n2 : ");
            int n2 = object.nextInt();

            int n3 = n1 / n2; // if we divided by zero,then exception will occur
            System.out.println("n1/n2 : " + n3);

            System.out.println("Rest of the code");
            System.out.println("Program continued");
        }
        catch (ArithmeticException r) { // exception is handled

            System.out.println("\ndividing by zero is not possible !!");
        }
        finally {

            System.out.println("\nfinally block");
        }

        System.out.println("\nafter try, catch and finally block");
    }
}
