package access_modifier;  //  Outside package2 only in subclass,if superclass is in package1

import access_modifier_1_protected.AccessModifierProtected_1;

public class ProtectedAccessModifier_3 extends AccessModifierProtected_1 {
    public static void main(String[] args) {

        ProtectedAccessModifier_3 object = new ProtectedAccessModifier_3();

        object.method_1(); // calling protected method of another class of another package
        System.out.println(object.instance_variable); // calling protected variable of another class of another package
    }
}



/*
protected keyword for class :
   Not accessible in whole java world
   Within package and its classes and subclasses
   Outside package2 only in subclass,if superclass is in package1
*/