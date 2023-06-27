package access_modifier_2_public;  // class with access modifier

public class AccessModifierPublic_2 {

    public void method_two(){  //accessing public class from another class within same package

        AccessModifierPublic_1 object = new AccessModifierPublic_1();
        object.method_one();
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