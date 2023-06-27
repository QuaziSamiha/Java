package exception_handling;  // use of throw keyword (11 January,2020 & 5:15pm,13 August,2020)

/*
The java throw keyword is used to explicitly throw an exception.
We can throw either checked or unchecked exception in java by throw keyword.The throw keyword is
mainly used to throw user defined exception.
Using throw keyword programmer handover exception object to JVM manually.
*/

public class ExceptionHandling_23 {

    static ArithmeticException e = new ArithmeticException();

    public static void main(String[] args) {

        throw e;
    }
}

/*
example :
public class ExceptionHandling_23 {
    public static void main(String[] args) {

        int v = 100/0;
        System.out.println("v : " +v);
    }
}

output :
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at exception_handling.ExceptionHandling_23.main(ExceptionHandling_23.java:13)

Process finished with exit code 1
--------------------------------------------------------------------------------------------------------------------------------
example :
public class ExceptionHandling_23 {
    public static void main(String[] args) {

        throw new ArithmeticException("dividing by zero is not possible");
    }
}

Exception in thread "main" java.lang.ArithmeticException: dividing by zero is not possible
	at exception_handling.ExceptionHandling_23.main(ExceptionHandling_23.java:13)

Process finished with exit code 1
------------------------------------------------------------------------------------------------------------------------------------
example :
public class ExceptionHandling_23 {

    static ArithmeticException e;

    public static void main(String[] args) {

        throw e;
    }
}

Exception in thread "main" java.lang.NullPointerException
	at exception_handling.ExceptionHandling_23.main(ExceptionHandling_23.java:16)

Process finished with exit code 1
-------------------------------------------------------------------------------------------------------------------------------
example :
public class ExceptionHandling_23 {

    static ArithmeticException e = new ArithmeticException();

    public static void main(String[] args) {

        throw e;
    }
}

Exception in thread "main" java.lang.ArithmeticException
	at exception_handling.ExceptionHandling_23.<clinit>(ExceptionHandling_23.java:12)

Process finished with exit code 1

 */