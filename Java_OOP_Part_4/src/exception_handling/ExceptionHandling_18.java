package exception_handling;  // finally block using (4:27pm,11 January,2020 & 11:23am,13 August,2020)

import java.util.Scanner;

public class ExceptionHandling_18 {
    public static void main(String[] args) {

        try {

            Scanner object = new Scanner(System.in);

            System.out.print("Enter an integer  n1 : ");
            int n1 = object.nextInt();
            System.out.print("Enter the divisor n2 : ");
            int n2 = object.nextInt();

            int n3 = n1 / n2; // if we divided by zero,then exception will occur
            System.out.println("n1/n2 : " + n3);

            System.out.println("Rest of the code"); // it will not execute if exception is created
            System.out.println("Program continued"); // it will not execute if exception is created
        }
        catch (ArithmeticException r) {

            int v = 100/0;  // exception
            System.out.println("\ndividing by zero is not possible !!");
        }
        finally {
            System.out.println("\nfinally block");
        }

        System.out.println("\nafter try, catch and finally block"); // it will not execute if exception is created
    }
}

/*

Enter an integer  n1 : 12
Enter the divisor n2 : 0

finally block
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exception_handling.ExceptionHandling_18.main(ExceptionHandling_18.java:27)

Process finished with exit code 1

*/