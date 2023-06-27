package interface_keyword; // one class implements one interface

// An interface is like a class with nothing but abstract methods and final fields(variables).

public class Interface_1 {
    public static void main(String[] args) {
        ClassOne object = new ClassOne(); // We cannot create object of an interface.

        // Any class can use an interface's constant from the name of the interface like class_name.variable_name .
        System.out.println(Interface_One_1.variable);
    }
}

/*
All methods and fields(variables) of an interface must be public.
Interface don't have instance variable.
All methods and fields of an interface are automatically (by default) public.
We cannot use the private and protected specifiers when declaring member of an interface.
*/

interface Interface_One_1 {
    int variable = 12; // public, final, static, its constant
}

class ClassOne implements Interface_One_1{

    int instance_variable = 12;

    // Any class can use an interface's constant from the name of the interface like class_name.variable_name .
    int v = instance_variable + Interface_One_1.variable;
}