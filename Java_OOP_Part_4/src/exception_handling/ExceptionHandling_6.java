package exception_handling; // handling exception using try and catch block (11:23pm,10 January,2020 & 8:25am,13 August,2020)

import java.util.Scanner;

public class ExceptionHandling_6 {
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        System.out.print("Enter an integer  n1 : ");
        int n1 = object.nextInt();
        System.out.print("Enter the divisor n2 : ");
        int n2 = object.nextInt();

        try { // minimum code

            int n3 = n1 / n2; // if we divided by zero,then unchecked exception will occur
            System.out.println("n1/n2 : " +n3);
            // if error doesn't occur,then catch block will not execute.
        }
        catch (ArithmeticException e){

            //if this block execute,then error will occur
            int v = 100/0;
            System.out.println("v : " +v);

            System.out.println("\ndividing by zero is not possible !!");
        }

        System.out.println("\nafter try and catch block");
    }
}
