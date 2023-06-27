package wrapper_class;

public class WrapperClass_2 {

    public static void main(String[] args) {

        // Autoboxing : converting primitive to object

        int variable_1 = 34;
        Integer object_1 = variable_1; // Integer.valueOf(variable_1); it will be done automatically by compiler
        System.out.println(object_1);

        boolean variable_2 = true;
        Boolean object_2 = variable_2; // Boolean.valueOf(variable_2); it will be done automatically by compiler
        System.out.println(object_2);

        double variable_3 = 123.78;
        Double object_3 = variable_3; // Double.valueOf(variable_3); it will be done automatically by compiler
        System.out.println(object_3);
    }
}
