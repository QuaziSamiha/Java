package access_modifier_inheritance; // access modifiers with inheritance (public)

public class AccessModifierInheritance_1 {
    public static void main(String[] args) {

        SubClass_1 object = new SubClass_1();
        object.method_2();
    }
}

// Methods declared public in a superclass also must be public in subclass.

class SuperClass_1{

    public int instance_variable = 10;
    public static int v1; // have to practice for static keyword

    public void method_1(){

        String local_variable = "11th August,2020"; // No access specifier can be applied to local variable.
        System.out.println(local_variable);

        System.out.println("class name  : SuperClass_1");
        System.out.println("method name : method_1()");
    }
}

class SubClass_1 extends SuperClass_1{

    public int instance_variable_1 = 200;
    public int instance_variable_2 = instance_variable + instance_variable_1;

    public void method_2(){

        method_1();

        System.out.println("\nclass name  : SubClass_1");
        System.out.println("method name : method_2()");
        System.out.println(instance_variable_2);
    }
}