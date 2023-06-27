package exception_handling;  // use of throws keyword (7:49pm,11 January,2020 & 7:00pm,13 August,2020)

import java.io.IOException;

/*
If you don't want explicitly catching handle an exception and want to declare that your method
throws the exception.This is passes the responsibility to handle this exception to the method that
invoked your method.This is done with the throws keyword.If your are calling a method that declares an
exception,you must either caught or declare the exception.

throws keyword required only to convince compiler and use of throw keyword doesn't prevent
abnormal termination of the program.

Syntax :
return-type method-name() throws ExceptionName
{
   checked exception occurs;
}
*/

public class ExceptionHandling_25 {
    public static void main(String[] args) throws IOException {
        //throws keyword can be used for methods and constructors but not for classes.

        Runtime object_1 = Runtime.getRuntime();
        String variable = "G:/JAVA/Java_OOP_Part_4/Exception_Handling_24.txt";

        // throws required only for checked exception and if we use throws for unchecked exception there will be no impact.
        Process object_2 = object_1.exec("notepad : " +variable); // checked exception
    }
}

