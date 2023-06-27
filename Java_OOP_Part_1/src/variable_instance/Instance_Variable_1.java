package variable_instance;

public class Instance_Variable_1 {  // main class
    public static void main(String[] args) { // main method

        // 4.we need an object of class to access instance variable.
        Class_Instance_Variable_1 object = new Class_Instance_Variable_1(); // creating object
        object.instance_variable_2 = 24; // accessing & initializing instance variable through object

        System.out.println("instance_variable_1 : " +object.instance_variable_1); // accessing instance variable through object
        System.out.println("instance_variable_2 : " +object.instance_variable_2);
    }
}

class Class_Instance_Variable_1 { // a class
    // 1.instance variables are declared in a class, but out side a method, constructor or any block .
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
