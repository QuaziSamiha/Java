package method_static;  // calling static method in static method

public class Static_Method_2 { // main class
    public static void main(String[] args) { // main static method
        // calling static method of another class

        Class_Static_Method_2.static_method();  // through class name

        Class_Static_Method_2 object = new Class_Static_Method_2(); // creating object
        object.static_method(); // through object but it is not a good practice
    }
}

class Class_Static_Method_2{
    static void static_method() {  // static method in another class
        int local_variable = 678;
        System.out.println(local_variable);
    }
}

/*
A static method belongs to the class rather than object of a class.
A static method can be invoked without object of the class.
Static method can access static data member and can change the value of it.
It can not use non static data member.
this and super cannot be used in static context.
It is also called class method.
If class name is same there is no need of object or class name for calling static method.
If class name is not same then we need to use of object or class name for calling static method.
*/
