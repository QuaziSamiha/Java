package method_instance;  // method returning string

public class Instance_Method_5 {
    public static void main(String[] args) {  // main method which is static

        Class_Instance_Method_5 object = new Class_Instance_Method_5();// creating object of another class in static method

        System.out.println("without parameter : " +object.instance_method_1());
        // calling instance method of another class in static method through object

        /*calling instance method through object in static method & initializing local variable of static method as instance method
        returning a string value*/
        String local_variable = object.instance_method_2("Program");
        System.out.println("with parameter : " +local_variable);
    }
}

class Class_Instance_Method_5 {
    String instance_method_1() { // method returning string without parameter
        String local_variable = "Java";
        return local_variable;
    }
    String instance_method_2(String parameter) { // method returning string with parameter
        String local_variable = parameter;
        return local_variable;
    }
}