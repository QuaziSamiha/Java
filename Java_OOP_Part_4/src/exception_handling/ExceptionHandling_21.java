package exception_handling; // exception propagation (5:08pm,11 January,2020 and 12:50pm,13 August,2020)

/*
Inside a method if an exception raised and if you are not handling that exception then exception
object will be propagated to caller then caller method is responsible to handle exception.This
process is called exception propagation.
*/

public class ExceptionHandling_21 {
    public static void main(String[] args) { // JVM will handle

        ExceptionHandling_21 object = new ExceptionHandling_21();

        System.out.println("Java Programming");
        object.instance_method_1();
    }

    void instance_method_1(){

        System.out.println("instance_method_1");
        instance_method_2();
        System.out.println("called instance_method_2");
    }

    void instance_method_2(){

        System.out.println("instance_method_2");
        int v = 110/2; // if int v = 100/0; then exception will occur
        System.out.println(v);
    }
}
