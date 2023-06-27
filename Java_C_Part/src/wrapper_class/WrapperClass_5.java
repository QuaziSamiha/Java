package wrapper_class;

// conversion between primitive data type and String

public class WrapperClass_5 {

    public static void main(String[] args) {

        // converting primitive data type to String

        int variable_1 = 14;
        String object_1 = Integer.toString(variable_1);  // Integer is a wrapper class , toString() method , String is a clas
        System.out.println(object_1);

        double variable_2 = 140.345;
        String object_2 = Double.toString(variable_2);  // Double is a wrapper class , toString() method , String is a clas
        System.out.println(object_2);
    }
}
