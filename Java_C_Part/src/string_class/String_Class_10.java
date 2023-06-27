package string_class; // use of charAt() method

public class String_Class_10 {

    public static void main(String[] args) {

        String object = "Java is a programming language";  // 30 characters total
        System.out.println(object);

        // giving a index number this method will return the character of that index
        char variable;
        variable = object.charAt(0);
        System.out.println("character : " +variable);

        variable = object.charAt(18);
        System.out.println("character : " +variable);

        variable = object.charAt(9);
        System.out.println("character : " +variable);

        variable = object.charAt(27);
        System.out.println("character : " +variable);
    }
}
