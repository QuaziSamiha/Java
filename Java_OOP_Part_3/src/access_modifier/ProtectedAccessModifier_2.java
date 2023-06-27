package access_modifier; //  Outside package2 only in subclass,if superclass is in package1

import access_modifier_1_protected.AccessModifierProtected_1;

public class ProtectedAccessModifier_2 extends AccessModifierProtected_1 {

    public void method(){

        method_1();  // calling protected method of another class of another package
        System.out.println(instance_variable);  // calling protected variable of another class of another package
    }
}

/*
protected keyword for class :
   Not accessible in whole java world
   Within package and its classes and subclasses
   Outside package2 only in subclass,if superclass is in package1
*/