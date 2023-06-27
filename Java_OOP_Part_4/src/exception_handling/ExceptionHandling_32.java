package exception_handling; // convert one type of exception to another (9:10pm,13 August,2020)

public class ExceptionHandling_32 {
    public static void main(String[] args) {

        try {
            method_1(); // can generate exception in this methods
            method_2();
        }
        catch (NullPointerException e){
            System.out.println("handled in main method");
        }
    }

    static void method_1(){

        try {
            int v = 100/2;
            System.out.println("v : " +v);
        }
        catch (ArithmeticException e){
            throw new NullPointerException();
        }
    }

    static void method_2(){

        try {
            int v = 100/0; // exception occurs
            System.out.println("v : " +v);
        }
        catch (ArithmeticException e){
            throw new NullPointerException(); // re-throw
        }
    }
}
