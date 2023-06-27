package inheritance_two; // Inheritance_5, Inheritance_6, Inheritance_7 and Inheritance_8 are related

public class Inheritance_7 {
    public static void main(String[] args) {

        Inheritance_6 object = new Inheritance_6();

        // accessing instance methods of superclass through object of subclass
        object.setV1("superclass private instance variable");
        String variable_1 = object.getV1();
        System.out.println(variable_1);
        object.setV2(2020);
        int variable_2 = object.getV2();
        System.out.println("private instance variable of superclass : " +variable_2);
        // accessing instance variable of superclass through object of subclass
        object.v3 = "9th August";
        System.out.println("default instance variable of superclass : " +object.v3);

        System.out.println("\n");

        // accessing instance methods of subclass through object of subclass
        object.setV("subclass private instance variable");
        System.out.println(object.getV());

//      object.method_subclass();
    }
}
