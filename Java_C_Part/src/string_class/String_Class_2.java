package string_class;  // comparing to string equal or not using equals() method

public class String_Class_2 {

    public static void main(String[] args) {

        String object_1 = "Java Programming";
        String object_2 = new String("Java Programming");

        if(object_1.equals(object_2)){  // using equals() method of String class
            System.out.println("strings are equal");
        }
        else {
            System.out.println("strings are not equal");
        }

        boolean variable = object_1.equals(object_2);
        System.out.println(variable);
    }
}
