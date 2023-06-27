package wrapper_class;

// conversion between primitive data type and String

public class WrapperClass_6 {

    public static void main(String[] args) {

        // converting String to primitive data type

        String object_1 = "121";
        int variable_1 = Integer.parseInt(object_1); // Integer is a wrapper class, parseInt() is a method
        System.out.println(variable_1);

        String object_2 = "12.3";
        float variable_2 = Float.parseFloat(object_2); // Integer is a wrapper class, parseInt() is a method
        System.out.println(variable_2);
    }
}
