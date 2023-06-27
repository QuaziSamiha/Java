package wrapper_class;

// wrapper classes are used to convert primitive data type into object and object into primitive data type

public class WrapperClass_1 {

    public static void main(String[] args) {

        // Autoboxing : converting primitive to object

        int variable_1 = 34;
        Integer object_1 = Integer.valueOf(variable_1); // Integer is wrapper-class , valueOf() is a method
        System.out.println(object_1);

        boolean variable_2 = true;
        Boolean object_2 = Boolean.valueOf(variable_2); // Boolean is wrapper-class , valueOf() is a method
        System.out.println(object_2);

        double variable_3 = 123.78;
        Double object_3 = Double.valueOf(variable_3); // Double is wrapper-class , valueOf() is a method
        System.out.println(object_3);
    }
}