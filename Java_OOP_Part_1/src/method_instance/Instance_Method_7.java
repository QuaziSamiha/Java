package method_instance;  // nesting of instance method

public class Instance_Method_7 {
    public static void main(String[] args){
        Class_1_Instance_Method object = new Class_1_Instance_Method(); // creating object in static method
        object.instance_method_1();
    }
}

class Class_1_Instance_Method {
    void instance_method_1() {
        Class_2_Instance_Method object = new Class_2_Instance_Method(); // creating object in instance method
        // calling instance method inside a instance method through object since two instance methods belong two different classes
        int local_variable = object.instance_method_1();
        System.out.println(local_variable);
    }
}

class Class_2_Instance_Method {
    int instance_method_1(){  // instance method without parameter returning value
        int local_variable_1 = 14, local_variable_2 = 24;
        return (local_variable_1 + local_variable_2);
    }
}
