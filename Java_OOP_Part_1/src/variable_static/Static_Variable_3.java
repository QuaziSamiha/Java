package variable_static;

// static variable, static method and static block

public class Static_Variable_3 {
    public static void main(String[] args) {
        // creating object
        Class_Static_Variable_3 object_1 = new Class_Static_Variable_3();
        Class_Static_Variable_3 object_2 = new Class_Static_Variable_3();

        // accessing & initializing through object
        object_1.static_variable = 38;
        object_2.static_variable = 76;
        /*
        The static variable can be used to refer the common property of all objects(that is not
        unique for each object).static variable belongs to class not an individual object.
        */
        System.out.println("object_1.static_variable : " +object_1.static_variable);
        System.out.println("object_2.static_variable : " +object_2.static_variable);
    }
}

class Class_Static_Variable_3 {
    static int static_variable;
}
/*
1.static variables are declared in a class but outside a constructor, method or any block.
2.The static variable can be used to refer the common property of all objects(that is not
unique for each object).static variable belongs to class not an individual object.It means copy is not
created for different object.
3.static variable is created by adding static keyword before the variable
4.we use class name or object for accessing static variables
        class_name.static_variable;
        object.static_variable;
5.initialization :
        class_name.static_variable = value;
        object.static_variable = value;
6. use of class_name is better
7.It is also called class variable.
*/