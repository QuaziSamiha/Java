package inheritance_two; // Inheritance_4, Inheritance_3, Inheritance_2 and Inheritance_1 are related

public class Inheritance_2 extends Inheritance_1 {

    // v1, v2, method_derived_class() are also in this class

    String v3; // instance variable

    void method_derived_class(){ // instance method

        System.out.println("Derived Class : ");
        System.out.println("v1 : " +v1);
        System.out.println("v2 : " +v2);
        System.out.println("v3 : " +v3);
        System.out.println("\n");
    }
}
