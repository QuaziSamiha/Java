package polymorphism;  // run-time polymorphism or dynamic binding or dynamic-method-dispatch  -> method overriding

// polymorphism is a mechanism where a parent class reference variable can take many forms(it can refer object from different classes

public class Polymorphism_2 {
    public static void main(String[] args) {

        SuperClass_One reference_variable = new SuperClass_One();
        reference_variable.method();

        reference_variable = new SubClass_One(); // here reference variable of superclass refers the object of subclass SubClass_One
        reference_variable.method(); // so it is calling the SubClass_One method()

        reference_variable = new SubClass_Two(); // here reference variable of superclass refers the object of subclass SubClass_Two
        reference_variable.method(); // so it is calling the SubClass_Two method()
    }
}

class SuperClass_One{

    void method(){ // overridden method
        System.out.println("superclass \n");
    }
}

class SubClass_One extends SuperClass_One{

    void method(){ // override method
        System.out.println("subclass 1 \n");
    }
}

class SubClass_Two extends SuperClass_One{

    void method(){ // override method
        System.out.println("subclass 2");
    }
}
