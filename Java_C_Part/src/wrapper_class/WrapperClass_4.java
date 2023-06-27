package wrapper_class;

public class WrapperClass_4 {

    public static void main(String[] args) {

        // Outboxing : converting object to primitive

        Double object_1 = new Double(123.98);  // Double is class
        System.out.println(object_1);
        double variable_1 =object_1; // object_1.doubleValue(); it will be done automatically by compiler
        System.out.println(variable_1);

        Character object_2 = new Character('M'); // Character is class
        System.out.println(object_2);
        char variable_2 = object_2; // object_2.charValue(); it will be done automatically by compiler
        System.out.println(variable_2);
    }
}
