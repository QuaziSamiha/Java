package access_modifier_1_public;  // class with access modifier

public class AccessModifier_1 {     // accessing public class from another package

    public int instance_variable = 1002;

    public void method_1(){  //Accessible in whole java world since public

        System.out.println("package name : access_modifier_1_public");
        System.out.println("class name   : AccessModifier_1");
        System.out.println("method name  : method_1()");
    }
}


/*

Public class can be accessed by other classes within the same package in which it is created
and classes outside of the package(classes of different packages).

public keyword for class :
   Accessible in whole java world
   Within package and its classes and subclasses
   Outside package and its classes and subclasses

visibility of the class should be checked before checking the visibility of the variable defined
inside that class. If the class is visible then the variable defined in that class will be visible.
If the class is not visible then no variable will be accessible, even if it is set to public.
*/