package method_static;  // calling static method in instance method belonging in the same class

// if class is same, instance method can call a static method directly.There is no need to use object.
// if class is not same,then we need to use object or class name.

public class Static_Method_3 {
    public static void main(String[] args) {
        Class_Static_Method_3 object = new Class_Static_Method_3();
        object.instance_method();
    }
}

class Class_Static_Method_3 {
    static int static_method() {
        int local_variable_1 = 12, local_variable_2 = 10;
        return (local_variable_1 + local_variable_2);
    }
    void instance_method() {
        int local_variable = static_method(); // calling static method in instance method
        System.out.println(local_variable);
        // If class is same, instance method can call a static method directly.There is no need to use object.
    }
}


