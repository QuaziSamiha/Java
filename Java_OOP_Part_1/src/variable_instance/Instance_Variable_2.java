package variable_instance;

public class Instance_Variable_2 { // main class
    public static void main(String[] args) { // main method
        
        Class_Instance_Variable_2 object_1 = new Class_Instance_Variable_2();
        Class_Instance_Variable_2 object_2 = new Class_Instance_Variable_2();

        // 3.Instance variable have separate value of each and every instance of the class.
        // for each object, different copy is created for each instance variable
        object_1.instance_variable_1 = 34; // accessing & initializing instance variable through object
        object_1.instance_variable_2 = 78; // accessing & initializing instance variable through object
        object_2.instance_variable_2 = 25; // accessing & initializing instance variable through object

        System.out.println("object_1.instance_variable_1 : " +object_1.instance_variable_1);
        System.out.println("object_1.instance_variable_2 : " +object_1.instance_variable_2);
        System.out.println("object_2.instance_variable_1 : " +object_2.instance_variable_1); // accessing instance variable through object
        System.out.println("object_2.instance_variable_2 : " +object_2.instance_variable_2);
    }
}

class Class_Instance_Variable_2 // a class
{
    int instance_variable_1 = 18; // declaring and initializing instance variable
    int instance_variable_2;  // declaring instance variable
}

/*
1.instance variables are declared in a class, but out side a method, constructor or any block .
2.Instance variable belongs to the instance of a class or you can say that instance variable
belongs to the object.
3.Instance variable have separate value of each and every instance of the class.
4.we need an object of class to access instance variable.
*/
