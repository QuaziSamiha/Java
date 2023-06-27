package access_modifier_inheritance; // access modifiers with inheritance (private and public)

public class AccessModifierInheritance_4 {
    public static void main(String[] args) {

        SubClass_4 object = new SubClass_4();
        object.method_2();
    }
}

/*
private keyword for class :
   Not accessible in whole java world
   Only with in same class even after inheriting it is not possible to access in subclass.
*/

class SuperClass_4{

    private int instance_variable = 10;

    public int method_1(){
        return instance_variable;
    }
}


class SubClass_4 extends SuperClass_4{

    public int instance_variable_1 = 200;
    public int instance_variable_2 = method_1() + instance_variable_1;

    public void method_2(){

        System.out.println("class name  : SubClass_2");
        System.out.println("method name : method_2()");
        System.out.println(instance_variable_2);
    }
}