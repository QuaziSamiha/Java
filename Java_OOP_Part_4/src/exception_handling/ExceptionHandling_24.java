package exception_handling;  // use of throws keyword (7:06pm,11 January,2020 & 6:09pm,13 August,2020)

// throws required only for checked exception and if we use throws for unchecked exception there will be no impact.
// It is recommended to use try-catch over throws keyword.

import java.io.IOException;

public class ExceptionHandling_24 {
    public static void main(String[] args) {

        Runtime object_1 = Runtime.getRuntime();
        String variable = "G:/JAVA/Java_OOP_Part_4/Exception_Handling_24.txt";

        try {

            Process object_2 = object_1.exec("notepad : " +variable); // checked exception
        }
        catch (IOException e){

        }
    }
}

