package string_class;  // use of startsWith() and endsWith() method

public class String_Class_8 {

    public static void main(String[] args) {

        String object = "Java Programming";
        boolean variable;

        variable = object.startsWith("J"); // true
        System.out.println(variable);

        variable = object.startsWith("j"); // false
        System.out.println(variable);

        variable = object.startsWith("Ja"); // true
        System.out.println(variable);

        variable = object.endsWith("g"); // true
        System.out.println(variable);
    }
}
