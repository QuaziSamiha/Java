package wrapper_class;

// conversion between primitive data type and String

public class WrapperClass_7 {

    public static void main(String[] args) {

        // converting String to primitive data type using valueOf() method

        String object_1 = "121";
        int variable_1 = Integer.valueOf(object_1); // Integer is a wrapper class, valueOf() is a method
        System.out.println(variable_1);

        String object_2 = "12.3";
        float variable_2 = Float.valueOf(object_2); // Integer is a wrapper class, valueOf() is a method
        System.out.println(variable_2);
    }
}

