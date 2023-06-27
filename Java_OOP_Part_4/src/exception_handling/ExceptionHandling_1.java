package exception_handling; // exception in java program   (7:34pm,10 January,2020 and 8:25am,12 August,2020)

/*
An exceptional condition is considered as a problem, which stops program execution from continuation
from the point of occurrence of it.
example :
     a.Division by zero (0)
     b.Array out of bound
Why exception occur :
     a.User error
     b.Programmer error
     c.Resources error

Exception Handling : As the term say it handles the exceptions.It is mechanism to handle run
time error.
Advantages :
     a.Maintain the normal flow of program
     b.Meaningful error reporting
Exception in java are handled by the use of below keywords : try,catch,throw,throws,finally
*/

import java.util.Scanner;

public class ExceptionHandling_1 {
    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        System.out.print("Enter an integer  n1 : ");
        int n1 = object.nextInt();
        System.out.print("Enter the divisor n2 : ");
        int n2 = object.nextInt();

        int n3 = n1/n2; // if we divided by zero,then exception will occur
        System.out.println("n1/n2 : " +n3);

        System.out.println("Rest of the code");
        System.out.println("Program continued");

    }
}

/*
output 1 :
Enter an integer  n1 : 10
Enter the divisor n2 : 2
n1/n2 : 5
Rest of the code
Program continue

Process finished with exit code 0

output 2 :
Enter an integer  n1 : 18
Enter the divisor n2 : 0
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exception_handling.ExceptionHandling_1.main(ExceptionHandling_1.java:20)

Process finished with exit code 1
*/

/*
What can we do if any exception occurs :
     a.Fix the problem and try again
     b.Do something else instead to avoid the problem
     c.Exit the application with System.exit()
     d.Rethrow the exception to some other method or portion of code
     e.Throw a new exception to replace it
     f.Return a default value (a non-void method : traditional way of handling exceptions)
     g.Eat the exception and return from the method (in a void method). In other words don't give
     importance to the exception.
     h.Eat the exception and continue in the same method (Rare and dangerous. Be careful if
     you do this).
*/