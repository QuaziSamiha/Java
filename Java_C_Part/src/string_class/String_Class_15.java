package string_class;  // use of split() method

public class String_Class_15 {

    public static void main(String[] args) {

        String object_1 = "Java is a programming language"; // 30 characters total

        System.out.println("Before : ");
        System.out.println(object_1);

        System.out.println("\nAfter  : ");
        String[] array_name = object_1.split(" "); // it will split the string based on white space

        for (String i : array_name) {
            System.out.println(i);
        }
    }
}
