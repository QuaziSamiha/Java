package exception_handling; // exception propagation (5:08pm,11 January,2020 and 12:50pm,13 August,2020)

public class ExceptionHandling_22 {
    public static void main(String[] args) {

        ExceptionHandling_22 object = new ExceptionHandling_22();

        System.out.println("Java Programming");

        try {

            object.instance_method_1();
        }
        catch (ArithmeticException r){

            System.out.println("\nexception handled in main method");
        }

    }

    void instance_method_1(){

        System.out.println("instance_method_1");
        instance_method_2();
        System.out.println("called instance_method_2");
    }

    void instance_method_2(){

        System.out.println("instance_method_2");
        int v = 110/0;  // if int v = 100/0; then exception will occur
        System.out.println(v);
    }
}
