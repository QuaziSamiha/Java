package polymorphism;

public class Polymorphism_1 {
    public static void main(String[] args) {

        SuperClass_1 object_1 = new SuperClass_1();

        SubClass_1 object_2 = new SubClass_1();
        SubClass_2 object_3 = new SubClass_2();

        // conventional way
        object_1.method();
        object_2.method();
        object_3.method();
    }
}

class SuperClass_1{

    void method(){ // overridden method
        System.out.println("superclass");
    }
}

class SubClass_1 extends SuperClass_1{

    void method(){ // override method
        System.out.println("subclass 1");
    }
}

class SubClass_2 extends SuperClass_1{

    void method(){ // override method
        System.out.println("subclass 2");
    }
}
