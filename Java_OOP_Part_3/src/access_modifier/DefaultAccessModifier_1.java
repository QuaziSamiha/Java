package access_modifier;  // class with access modifier ( default )

// We can use public and default access specifier for class

class DefaultAccessModifier_1 {

    String instance_variable = "11th August,2020";

    void method_1(){
        System.out.println("   Default Method & Class      ");
        System.out.println("package name : access_modifier");
        System.out.println("class name   : DefaultAccessModifier_1");
        System.out.println("method name  : method_1()");
    }
}

/*

Default class can be accessed by other classes within the same package in which it is created but
classes of different packages cannot access.

default variable for class :
   Not accessible in whole java world
   Only within package1

*/