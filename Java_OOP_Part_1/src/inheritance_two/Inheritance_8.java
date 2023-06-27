package inheritance_two; // Inheritance_5, Inheritance_6, Inheritance_7 and Inheritance_8 are related

// single inheritance

public class Inheritance_8 {
    public static void main(String[] args) {

        Inheritance_6 object = new Inheritance_6();

        // accessing instance methods of superclass through object of subclass
        object.setV1("superclass private variable");
        object.setV2(2020);
        object.v3 = "9th August";

        // accessing instance method of subclass through object of subclass
        object.setV("subclass private variable");
        object.method_subclass();
    }
}
