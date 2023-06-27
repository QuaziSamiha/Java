package method_overloading;  // method overloading in terms of type of parameter

// When more than one method with the same name is defined in the same class, it is known as method overloading.

public class Method_Overloading_1 {
    public static void main(String[] args) {
        Class_Method_Overloading_1 object = new Class_Method_Overloading_1();
        object.instance_method(10,24);
        object.instance_method(5,12.0f);
    }
}

class Class_Method_Overloading_1 {
    void instance_method(int parameter_1, int parameter_2) {
        int local_variable_1 = parameter_1, local_variable_2 = parameter_2;
        System.out.println(local_variable_1 + local_variable_2);
    }
    void instance_method(int parameter_1, float parameter_2) {
        int local_variable_1 = parameter_1;
        float local_variable_2 = parameter_2;
        System.out.println(local_variable_1 * local_variable_2);
    }
}


