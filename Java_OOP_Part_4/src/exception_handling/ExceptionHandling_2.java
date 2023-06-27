package exception_handling; // unchecked exception in java program   (10 January,2020 and 9:30am,12 August,2020)

import java.util.Scanner;

/*
Type of exception :
     a.Unchecked Exception
     b.Checked Exception
An unchecked exception is a type of exception for that you have option either handle it or ignore it.
It you elect to ignore the possibility of an unchecked exception,then,as a result of that, your
program will terminate.If you elect to handle an unchecked exception that occur, then the result will
depend on the code that you have written to handle the exception.
example : array index out of bound, dividing any number by zero

The exception which are checked by compiler are called unchecked exception.
Compiler do not procedure any error whether you handle or ignore unchecked exceptions.
*/

public class ExceptionHandling_2 {
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        System.out.print("Enter an integer  n1 : ");
        int n1 = object.nextInt();
        System.out.print("Enter the divisor n2 : ");
        int n2 = object.nextInt();

        int n3 = n1/n2; // if we divided by zero,then unchecked exception will occur
        System.out.println("n1/n2 : " +n3);

        System.out.println("Rest of the code"); // it will not execute if exception is created
        System.out.println("Program continued"); // it will not execute if exception is created
    }
}

/*
There is no compile time exception.
Whether it is checked exception or unchecked exception it only occurs at run time.
*/