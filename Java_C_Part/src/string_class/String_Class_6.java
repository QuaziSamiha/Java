package string_class;  // concatenation of string

public class String_Class_6 {

    public static void main(String[] args) {

        String object_1 = "Java";
        String object_2 = " Programming";

        String object_3 = object_1 + object_2;  // concatenation of string using plus operator
        System.out.println(object_3);

        String object_4 = object_1.concat(object_2);  // concatenation of string using concat() method
        System.out.println(object_4);
    }
}
