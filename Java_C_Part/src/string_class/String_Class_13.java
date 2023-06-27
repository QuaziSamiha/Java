package string_class;  // use of trim() method

public class String_Class_13 {

    public static void main(String[] args) {

        String object_1 = "  Java is a programming language  "; // 34 characters total

        System.out.println("Before : ");
        System.out.println(object_1);

        String object_2 = object_1.trim(); // it will remove space before and after the string

        System.out.println("After  : ");
        System.out.println(object_2);
    }
}
