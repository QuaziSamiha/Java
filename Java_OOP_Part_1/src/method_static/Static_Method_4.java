package method_static;  // calling static method in instance method belonging in different class

// if class is same, instance method can call a static method directly.There is no need to use object.
// if class is not same,then we need to use object or class name.

public class Static_Method_4 { // main class
    public static void main(String[] args) { // main static method
        Class_2_Static_Method object = new Class_2_Static_Method();
        object.instance_method();
    }
}

class Class_1_Static_Method {
    static int static_method() {
        int local_variable_1 = 12, local_variable_2 = 10;
        return (local_variable_1 + local_variable_2);
    }
}

class Class_2_Static_Method {
    void instance_method() {
        int local_variable = Class_1_Static_Method.static_method();
        // calling static method in instance method through class name
        System.out.println(local_variable);
    }
}

