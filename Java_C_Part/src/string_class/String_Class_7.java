package string_class;  // use of toUpperCase() method and toLowerCase() method

public class String_Class_7 {

    public static void main(String[] args) {

        String object_1 = "Java Programming";
        String object_2;

        object_2 = object_1.toUpperCase();  // toUpperCase() method makes each latter in upper case
        System.out.println(object_2);

        object_2 = object_1.toLowerCase(); // toLowerCase() method makes each latter in lower case
        System.out.println(object_2);
    }
}
