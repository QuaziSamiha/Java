package inheritance_two; // Inheritance_4, Inheritance_3, Inheritance_2 and Inheritance_1 are related

public class Inheritance_4 {
    public static void main(String[] args) {

        Inheritance_2 object_1 = new Inheritance_2();
        Inheritance_2 object_2 = new Inheritance_2();

        // accessing instance variable of superclass through object of subclass
        object_1.v1 = "Base Class instance variable";
        object_1.v2 = 1001;
        // accessing instance method of superclass through object of subclass
        object_1.method_base_class();

        object_1.v3 = "Derived Class instance variable"; // accessing instance variable of subclass through object of subclass
        object_1.method_derived_class(); // accessing instance method of subclass through object of subclass
 //----------------------------------------------------------------------------------------------------------------------------------

        // accessing instance variable of superclass through object of subclass
        object_2.v1 = "Parent Class instance variable";
        object_2.v2 = 2002;
        // accessing instance method of superclass through object of subclass
        object_2.method_base_class();

        object_2.v3 = "Child Class instance variable"; // accessing instance variable of subclass through object of subclass
        object_2.method_derived_class(); // accessing instance method of subclass through object of subclass
    }
}
