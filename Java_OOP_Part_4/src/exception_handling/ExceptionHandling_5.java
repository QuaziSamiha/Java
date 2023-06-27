package exception_handling; // handling exception using try and catch block (11:12pm,10 January,2020 & 8:25am,13 August,2020)

import java.util.Scanner;

public class ExceptionHandling_5 {
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        System.out.print("Enter an integer  n1 : ");
        int n1 = object.nextInt();
        System.out.print("Enter the divisor n2 : ");
        int n2 = object.nextInt();

        try { // minimum code

            int n3 = n1 / n2; // if we divided by zero,then unchecked exception will occur
            System.out.println("n1/n2 : " +n3);
        }
        catch (ArithmeticException e){

            System.out.println("\ndividing by zero is not possible !!"); // handling code
        }

        System.out.println("Rest of the code");
        System.out.println("Program continued");

        System.out.println("\nafter try and catch block");
    }
}
