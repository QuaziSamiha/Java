package method_static;  // calling static method in static method belonging in the same class

public class Static_Method_1 { // main class
    public static void main(String[] args) {  // main method which is also static
        // if class name is same there is no need of object or class name for calling static method.
        static_method(); // calling static method without object inside a static method belonging in the same class
        // it can be called nesting of static method
    }

    static void static_method() {  // class method or static method in main class
        int local_variable = 678;
        System.out.println(local_variable);
    }
}

/*
A static method belongs to the class rather than object of a class.
A static method can be invoked without object of the class.
Static method can access static data member or static variable and can change the value of it.
It can not use non static data member or non static variable.
this and super cannot be used in static context.
It is also called class method.
If class name is same there is no need of object or class name for calling static method.
If class name is not same then we need to use of object or class name for calling static method.
*/
