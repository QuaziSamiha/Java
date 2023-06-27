package method_instance;  // instance method in another class

public class Instance_Method_3 { // main class
    public static void main(String[] args) { // main & static method

        Class_Instance_Method_3 object = new Class_Instance_Method_3(); // creating object of another class in main method
        object.instance_method(12);  // calling instance method in static method through object & passing value
        /* You can not call an instance method in static method directly so instance method can be invoked using object of class. */
    }
}

class Class_Instance_Method_3 {  // another class
    void instance_method(int parameter) {  // instance method in another class (Class_Instance_Method_3)
        int local_variable_1 = parameter, local_variable_2 = 12;
        int local_variable_3 = local_variable_1 + local_variable_2;
        System.out.println("local_variable_3 : " +local_variable_3);
    }
}

/*
Instance methods can access instance variables and instance method directly.
Instance methods can access static variables and static method directly.
You can not call an instance method in static method directly so instance method can be invoked using
object of class.
Instance method can call an instance methods directly.There is no need to use object.
*/

