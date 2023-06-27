package method_static;  // class Static_Method_9 and Static_Method_8 is related

public class Static_Method_8 {

    int instance_variable = 23;
    static int static_variable_1 = 122;
    static int static_variable_2 = 322;

    static void static_method_1(){
    //  static_method_2();
        System.out.println("static method 1");
        System.out.println("static variable : " +static_variable_1);
    }

    static void static_method_2(){
        static_variable_2 = 1009;
        static_method_1();
        System.out.println("static method 2");
        System.out.println("static variable : " +static_variable_2);
 //     System.out.println("instance variable : " +instance_variable);
    }
}
