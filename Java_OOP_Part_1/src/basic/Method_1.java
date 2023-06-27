package basic;  // why we use method

public class Method_1 {
    public static void main(String[] args) {
        Class_Method_1 object_1 = new Class_Method_1();

        object_1.variable_1 = 3456;
        object_1.variable_2 = "Java";
        object_1.variable_3 = 23.343f;
        object_1.variable_4 = 'f';

        object_1.instance_method();
        // Methods help to do the same task repeatedly so it reduces the statements in program and helps to do same task easily
        /*
        System.out.println("integer   : " +object_1.variable_1);
        System.out.println("string    : " +object_1.variable_2);
        System.out.println("float     : " +object_1.variable_3);
        System.out.println("character : " +object_1.variable_4);
        */
        Class_Method_1 object_2 = new Class_Method_1();

        object_2.variable_1 = 34;
        object_2.variable_2 = "Java Programming";
        object_2.variable_3 = 100.343f;
        object_2.variable_4 = 'M';
        object_2.instance_method();
        // Methods help to do the same task repeatedly so it reduces the statements in program and helps to do same task easily
        /*
        System.out.println("integer   : " +object_2.variable_1);
        System.out.println("string    : " +object_2.variable_2);
        System.out.println("float     : " +object_2.variable_3);
        System.out.println("character : " +object_2.variable_4);
        */
    }
}
class Class_Method_1{
    int variable_1;
    String variable_2;
    float variable_3;
    char variable_4;

    void instance_method(){
        System.out.println("integer   : " +variable_1);
        System.out.println("string    : " +variable_2);
        System.out.println("float     : " +variable_3);
        System.out.println("character : " +variable_4);
        System.out.println("\n");
    }
    // we can also make a method to take input
}
