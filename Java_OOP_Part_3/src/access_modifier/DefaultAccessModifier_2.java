package access_modifier; // class with access modifier ( default )

// We can use public and default access specifier for class

public class DefaultAccessModifier_2 {
    public static void main(String[] args) {

        DefaultAccessModifier_1 object = new DefaultAccessModifier_1();
        object.method_1();
        System.out.println(object.instance_variable);
    }
}

/*

Default class can be accessed by other classes within the same package in which it is created but
classes of different packages cannot access.

default variable for class :
   Not accessible in whole java world
   Only within package1

*/