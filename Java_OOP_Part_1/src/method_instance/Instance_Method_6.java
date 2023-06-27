package method_instance;  // nesting of instance method

public class Instance_Method_6 {
    public static void main(String[] args) {

        Class_Instance_Method_6 object = new Class_Instance_Method_6();
        object.instance_method_2();
    }
}

class Class_Instance_Method_6 {
    int instance_method_1() {  // instance method returning value without parameter
        int local_variable_1 = 14, local_variable_2 = 24;
        return (local_variable_1 + local_variable_2);
    }
    void instance_method_2() {
        int local_variable = instance_method_1(); // calling instance method inside a instance method
        System.out.println(local_variable);
    }
}
/*
Instance method can call an instance methods directly. There is no need to use object.
But two methods have to remain same class.
*/

