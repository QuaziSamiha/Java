package variable_static;

public class Static_Variable_4 {
    String instance_Variable_1;
    int instance_variable_2;
    static String static_variable_1 = "Java Programming";
    static String static_variable_2;

    Static_Variable_4(String p1, int p2){  // constructor
        instance_Variable_1 = p1;
        instance_variable_2 = p2;
    }

    void instance_method(){
        System.out.println("task          : " +instance_Variable_1);
        System.out.println("year          : " +instance_variable_2);
        System.out.println("language name : " +static_variable_1);
        System.out.println("institute     : " +static_variable_2);
        System.out.println();
    }
}
