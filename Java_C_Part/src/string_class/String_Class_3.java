package string_class;  // difference between equals() and equalsIgnoreCase() method

public class String_Class_3 {

    public static void main(String[] args) {

        String object_1 = "java Programming";
        String object_2 = new String("Java Programming");

        System.out.println("using equals() method : ");
        if (object_1.equals(object_2)) {  // using equals() method of String class
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

        System.out.println("\nusing equalsIgnoreCase() method : ");
        if (object_1.equalsIgnoreCase(object_2)) {  // using equalsIgnoreCase() method of String class
            System.out.println("strings are equal");
        } else {
            System.out.println("strings are not equal");
        }

    }
}
