package access_modifier_inheritance;  // access modifiers with inheritance (private)

public class AccessModifierInheritance_3 {
    public static void main(String[] args) {

        SubClass_3 object = new SubClass_3();
        object.method_2();
    }
}

/*
private keyword for class :
   Not accessible in whole java world
   Only with in same class even after inheriting it is not possible to access in subclass.
*/

class SuperClass_3{

    private int instance_variable = 10;

    private void method_1(){

        String local_variable = "11th August,2020"; // No access specifier can be applied to local variable.
        System.out.println(local_variable);

        System.out.println("class name  : SuperClass_2");
        System.out.println("method name : method_1()");
    }
}


class SubClass_3 extends SuperClass_3{

    public int instance_variable_1 = 200;
//  public int instance_variable_2 = instance_variable + instance_variable_1; will show an error

    public void method_2(){

  //    method_1(); will show an error

        System.out.println("\nclass name  : SubClass_2");
        System.out.println("method name : method_2()");
    }
}