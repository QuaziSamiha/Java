package string_class; // use of codePointAt() method

public class String_Class_11 {

    public static void main(String[] args) {

        String object = "Java is a programming language"; // 30 characters total
        System.out.println(object);

        // giving a index number this method will return the ASCII value of the character of that index
        int variable;

        variable = object.codePointAt(0);  // J
        System.out.println("ASCII value of \'J\' : " +variable);

        variable = object.codePointAt(1);  // a
        System.out.println("ASCII value of \'a\' : " +variable);

        variable = object.codePointAt(29); // e
        System.out.println("ASCII value of \'e\' : " +variable);

    }
}
