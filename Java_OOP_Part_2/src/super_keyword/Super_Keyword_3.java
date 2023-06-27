package super_keyword;  // super keyword with method

public class Super_Keyword_3 {
    public static void main(String[] args) {
        Class_2_Super_Keyword_3 object = new Class_2_Super_Keyword_3();
        object.instance_method_2();
    }
}

class Class_1_Super_Keyword_3 {  //superclass

    int instance_variable_1 = 100;

    void instance_method_1() {  // overridden method
        System.out.println("instance_method_1 of superclass");
        System.out.println("instance_variable_1 of superclass : " +instance_variable_1);
    }
}

class Class_2_Super_Keyword_3 extends Class_1_Super_Keyword_3 {  //subclass

    int instance_variable_2 = 200;

    void instance_method_1() { // override method
        System.out.println("\ninstance_method_1 of subclass");
        System.out.println("instance_variable_2 of subclass : " +instance_variable_2);
    }

    void instance_method_2() {

        instance_method_1();//calling method of subclass

        super.instance_method_1(); //calling method of superclass
    }
}




