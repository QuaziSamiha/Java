package variable_static;  //accessing static variable through class name

public class Static_Variable_1 {  // main class
    public static void main(String[] args) { // main method
        Class_Static_Variable_1.static_variable_2 = 56; //accessing static variable through class name
        System.out.println("Accessing static variable through class name : ");
        System.out.println("Class_Static_Variable_1.static_variable_1 : " + Class_Static_Variable_1.static_variable_1);
        System.out.println("Class_Static_Variable_1.static_variable_2 : " + Class_Static_Variable_1.static_variable_2);
    }
}

class Class_Static_Variable_1 {
    static int static_variable_1 = 85; //static variable declaring and initializing
    static int static_variable_2; // declaring static variable
}

/*
1.static variables are declared in a class but outside a constructor, method or any block.
2.The static variable can be used to refer the common property of all objects(that is not
unique for each object).static variable belongs to class not an individual object.It means copy is not
created for different object.
3.static variable is created by adding static keyword before the variable.
4.we use class name or object for accessing static variables
   class_name.static_variable;
   object.static_variable;
5.initialization :
   class_name.static_variable = value;
   object.static_variable = value;
6. use of class_name is better
7.It is also called class variable.
*/
