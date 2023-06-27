package exception_handling; // checked exception in java program   (10 January,2020 and 9:30am,12 August,2020)

/*
Checked exceptions are those that cannot be ignored when you write the code.
example : file doesn't exists
The exception which are checked by compiler for smooth execution of program at runtime are called
checked exception.
We will get compile time error if we didn't handle checked exception.
*/

import java.util.Scanner;

public class ExceptionHandling_3 {
    public static void main(String[] args) {

        Runtime object_1 = Runtime.getRuntime();

        String file_location = "G:/JAVA/Java_OOP_Part_4/Exception_Handling_24.txt";

//      Process object_2 = object_1.exec("file folder in Java_C_Part project folder :", +file_location);
//      it is checked exception
    }
}

/*
There is no compile time exception.
Whether it is checked exception or unchecked exception it only occurs at run time.
*/
