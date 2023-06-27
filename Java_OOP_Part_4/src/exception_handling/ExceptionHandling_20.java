package exception_handling;  // finally block using (4:27pm,11 January,2020 & 11:23am,13 August,2020)


import java.util.Scanner;

public class ExceptionHandling_20 {
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
        catch (ArithmeticException r) {

            System.out.println("\ndividing by zero is not possible !!");
        }
        finally {

            System.out.println("\nfinally block");
        }

        int v = 100/0;
        System.out.println("\nafter try, catch and finally block");  // it will not execute
    }
}

/*
output 1 :
Enter an integer  n1 : 12
Enter the divisor n2 : 2
n1/n2 : 6
Rest of the code
Program continued

finally block
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exception_handling.ExceptionHandling_20.main(ExceptionHandling_20.java:33)

Process finished with exit code 1

output 2 :
Enter an integer  n1 :  12
Enter the divisor n2 : 0

dividing by zero is not possible !!

finally block
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exception_handling.ExceptionHandling_20.main(ExceptionHandling_20.java:33)

Process finished with exit code 1

*/