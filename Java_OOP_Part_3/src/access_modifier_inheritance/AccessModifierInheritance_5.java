package access_modifier_inheritance; // access modifiers with inheritance (default)

public class AccessModifierInheritance_5 {
    public static void main(String[] args) {

        SubClass_5 object = new SubClass_5();
        object.method_2();
    }
}

/*
default variable for class :
   Not accessible in whole java world
   Only within package1
*/
class SuperClass_5{

    int instance_variable = 10;

    void method_1(){

        String local_variable = "11th August,2020"; // No access specifier can be applied to local variable.
        System.out.println(local_variable);

        System.out.println("class name  : SuperClass_2");
        System.out.println("method name : method_1()");
    }
}


class SubClass_5 extends SuperClass_5{

    int instance_variable_1 = 200;
    int instance_variable_2 = instance_variable + instance_variable_1;

    void method_2(){

        method_1();

        System.out.println("\nclass name  : SubClass_2");
        System.out.println("method name : method_2()");
        System.out.println(instance_variable_2);
    }
}

/*
We can use public and default access specifier for class and interface
We cannot use private and protected access specifier for class and interface
Interface is always public. With and without public keyword interface is public.
We can not use the private and protected specifier while declaring member of an interface.
*/