package access_modifier;  // class with access modifier ( Public )

import access_modifier_1_public.AccessModifier_1;

// We can use public and default access specifier for class
// We cannot use private and protected access specifier for class

public class PublicAccessModifier_1 {
    public static void main(String[] args) {

        AccessModifier_1 object = new AccessModifier_1();  // //accessing public class from another package
        object.method_1();

        System.out.println(object.instance_variable);
    }
}

/*
Visibility Mode Or Access Modifier
Public
Protected
Private

Public class can be accessed by other classes within the same package in which it is created
and classes outside of the package(classes of different packages).

public keyword for class :
   Accessible in whole java world
   Within package and its classes and subclasses
   Outside package and its classes and subclasses

visibility of the class should be checked before checking the visibility of the variable defined
inside that class. If the class is visible then the variable defined in that class will be visible.
If the class is not visible then no variable will be accessible, even if it is set to public.

We can use public and default access specifier for class and interface
We cannot use private and protected access specifier for class and interface
Interface is always public. With and without public keyword interface is public.
We can not use the private and protected specifier while declaring member of an interface.

*/