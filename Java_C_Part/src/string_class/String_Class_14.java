package string_class;  // use of replace() method

public class String_Class_14 {

    public static void main(String[] args) {

        String object_1 = "Java is a programming language"; // 30 characters total

        System.out.println("Before : ");
        System.out.println(object_1);

        String object_2 = object_1.replace('a', 'A'); // it will replace a character by another character

        System.out.println("After  : ");
        System.out.println(object_2);
    }
}
