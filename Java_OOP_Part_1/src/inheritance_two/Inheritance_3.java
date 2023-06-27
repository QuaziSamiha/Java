package inheritance_two;  // single inheritance

public class Inheritance_3 {
    public static void main(String[] args) {

        Inheritance_2 object = new Inheritance_2();

        // accessing instance variable of superclass through object of subclass
        object.v1 = "Base Class instance variable";
        object.v2 = 1001;
        // accessing instance method of superclass through object of subclass
        object.method_base_class();

        object.v3 = "Derived Class instance variable"; // accessing instance variable of subclass through object of subclass
        object.method_derived_class(); // accessing instance method of subclass through object of subclass
    }
}
