package exception_handling;  // use of throws keyword (8:03pm,11 January,2020 & 7:13pm,13 August,2020)

/*
We can use throws keyword only for throwable object if we use normal java classes then we will
get compile time error : incompatible types
*/

public class ExceptionHandling_26 extends RuntimeException{
    // now ExceptionHandling_26 is throwable since ExceptionHandling_26 is a subclass of RuntimeException
    public static void main(String[] args) throws ExceptionHandling_26 {

        Runtime object_1 = Runtime.getRuntime();
        String variable = "G:/JAVA/Java_OOP_Part_4/Exception_Handling_24.txt";

//      Process object_2 = object_1.exec("notepad : " +variable); it will show error since not appropriate exception handling
    }
}

/*

public class ExceptionHandling_26 {
    public static void main(String[] args) throws ExceptionHandling_26 { // showing error
// it will show an error since ExceptionHandling_26 is not a throwable

        Runtime object_1 = Runtime.getRuntime();
        String variable = "G:/JAVA/Java_OOP_Part_4/Exception_Handling_24.txt";

//      Process object_2 = object_1.exec("notepad : " +variable); // checked exception
    }
}

***********SOLUTION***************
public class ExceptionHandling_26 extends RuntimeException{
    // now ExceptionHandling_26 is throwable since ExceptionHandling_26 is a subclass of RuntimeException
    public static void main(String[] args) throws ExceptionHandling_26 {

        Runtime object_1 = Runtime.getRuntime();
        String variable = "G:/JAVA/Java_OOP_Part_4/Exception_Handling_24.txt";

//      Process object_2 = object_1.exec("notepad : " +variable); it will show error since not appropriate exception handling
    }
}

*/