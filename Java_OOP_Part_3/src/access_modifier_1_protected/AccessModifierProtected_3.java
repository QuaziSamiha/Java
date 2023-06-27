package access_modifier_1_protected;

/*
protected keyword for class :
   Not accessible in whole java world
   Within package and its classes and subclasses
*/

public class AccessModifierProtected_3 {
    public static void main(String[] args) {

        AccessModifierProtected_Three object = new AccessModifierProtected_Three();

        object.method();

        object.method_1();
        System.out.println(object.instance_variable);
    }
}

class AccessModifierProtected_Three extends AccessModifierProtected_2{

    public void method(){

        method_1(); // calling protected method of another class of same package
        System.out.println(instance_variable);
    }
}