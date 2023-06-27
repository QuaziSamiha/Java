package access_modifier_1_protected;

/*
protected keyword for class :
   Not accessible in whole java world
   Within package and its classes and subclasses
*/

public class AccessModifierProtected_2 {

    protected String instance_variable = "11th August,2020";

    protected void method_1(){ // overridden method

        System.out.println("          SuperClass       ");
        System.out.println("package name : access_modifier_1_protected");
        System.out.println("class name   : AccessModifierProtected_2");
        System.out.println("method name  : method_1()");
    }
}
