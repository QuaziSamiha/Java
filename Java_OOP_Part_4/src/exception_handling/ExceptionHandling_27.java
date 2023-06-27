package exception_handling; // use of throws keyword (8:10pm,11 January,2020 & 7:26pm,13 August,2020)

// //throws keyword can be used for methods and constructors but not for classes.

import java.io.IOException;

public class ExceptionHandling_27 {

    ExceptionHandling_27() throws IOException{

        // constructor
    }

    public static void main(String[] args) throws IOException {

        Runtime object_1 = Runtime.getRuntime();
        String variable = "G:/JAVA/Java_OOP_Part_4/Exception_Handling_24.txt";

        Process object_2 = object_1.exec("notepad : " +variable); // checked exception
    }
}
