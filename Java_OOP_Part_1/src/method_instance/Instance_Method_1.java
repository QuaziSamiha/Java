package method_instance;   // instance method without parameter in same class

public class Instance_Method_1 { // main class
    public static void main(String[] args){
        // any java program starts executing from main method of main class and main method is always static

        Instance_Method_1 object = new Instance_Method_1(); // creating object in static method

        /* You can not call an instance method in static method directly so instance method can be invoked using object of class. */
        object.instance_method(); // calling instance method in static method through object
        System.out.println("Method_1");
    }

    void instance_method() {  // instance method in main class (class Method_1)
        int local_variable = 13;
        System.out.println(local_variable);
    }
}

/*
A java method is a collection of statements that are grouped together to perform
an operation.
A class can contain any number of methods.
Methods can be with parameter and without parameter.
1.Instance method and 2.Static/class method
*/

/*
Instance methods can access instance variables and instance method directly.
Instance methods can access static variables and static method directly.
You can not call an instance method in static method directly so instance method can be invoked using
object of class.
Instance method can call an instance methods directly.There is no need to use object.
*/
