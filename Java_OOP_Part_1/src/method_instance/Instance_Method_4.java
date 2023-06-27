package method_instance;  // instance method returning value

public class Instance_Method_4 { // main class
    public static void main(String[] args) { // main method which is static

        Class_Instance_Method_4 object = new Class_Instance_Method_4(); // creating object of another class in static method

        System.out.println(object.instance_method_1()); // calling instance method of another class in static method through object

        /*calling instance method through object in static method & passing value and initializing local variable of static method
        as instance method returning an integer value*/
        int local_variable = object.instance_method_2(12);
        System.out.println(local_variable);
    }
}

class Class_Instance_Method_4 { // another class

    int instance_method_1() // instance method without parameter returning value
    {
        int local_variable_1 = 14, local_variable_2 = 24;
        return (local_variable_1 + local_variable_2);
    }
    int instance_method_2(int parameter) // instance method with parameter returning value
    {
        int local_variable = parameter;
        return (local_variable * local_variable);
    }
}

