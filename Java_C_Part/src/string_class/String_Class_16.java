package string_class;  // use of split() method

public class String_Class_16 {
    public static void main(String[] args) {

        String object;

        object = "Java_is a_programming language";

        System.out.println("Before : ");
        System.out.println(object);

        System.out.println("\nAfter  : ");
        String[] array_name = object.split("_"); // it will split the string based on under-score

        for (String i : array_name) {
            System.out.println(i);
        }
//------------------------------------------------------------------------------------------------------------------
        object = "Java is_a programming_language";

        System.out.println("\nBefore : ");
        System.out.println(object);

        System.out.println("\nAfter  : ");
        array_name = object.split("_"); // it will split the string based on under-score

        for (String i : array_name) {
            System.out.println(i);
        }
    }
}
