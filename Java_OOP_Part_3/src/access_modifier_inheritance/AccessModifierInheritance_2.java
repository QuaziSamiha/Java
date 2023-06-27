package access_modifier_inheritance;  // access modifiers with inheritance (protected)

public class AccessModifierInheritance_2 {
    public static void main(String[] args) {

        SubClass_2 object = new SubClass_2();
        object.method_2();
    }
}

/*
Methods declared protected in a superclass also must either be protected or public in
subclasses, they cannot be private.
*/

class SuperClass_2{

    protected int instance_variable = 10;

    protected void method_1(){

        String local_variable = "11th August,2020"; // No access specifier can be applied to local variable.
        System.out.println(local_variable);

        System.out.println("class name  : SuperClass_2");
        System.out.println("method name : method_1()");
    }
}


class SubClass_2 extends SuperClass_2{

    public int instance_variable_1 = 200;
    public int instance_variable_2 = instance_variable + instance_variable_1;

    public void method_2(){

        method_1();

        System.out.println("\nclass name  : SubClass_2");
        System.out.println("method name : method_2()");
        System.out.println(instance_variable_2);
    }
}