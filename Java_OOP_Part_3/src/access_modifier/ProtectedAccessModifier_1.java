package access_modifier; // protected access modifier with package

//  Outside package2 only in subclass,if superclass is in package1

import access_modifier_1_protected.AccessModifierProtected_1;

public class ProtectedAccessModifier_1 {
    public static void main(String[] args) {

        ProtectedAccessModifier_One object = new ProtectedAccessModifier_One();
        object.method_1();
    }
}

class ProtectedAccessModifier_One extends AccessModifierProtected_1{

    @Override
    protected void method_1() {
        super.method_1();

        System.out.println("\n");

        System.out.println("          SubClass  ");
        System.out.println("package name : access_modifier");
        System.out.println("class name   : ProtectedAccessModifier_1");
        System.out.println("method name  : method_1()");
    }

    public void method(){
        System.out.println(instance_variable);
    }
}


/*
protected keyword for class :
   Not accessible in whole java world
   Within package and its classes and subclasses
   Outside package2 only in subclass,if superclass is in package1
*/