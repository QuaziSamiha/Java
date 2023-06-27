package string_class;  // checking string is empty or not using isEmpty() method

public class String_Class_5 {

    public static void main(String[] args) {

        String object_1 = "Java Programming";
        String object_2 = "";
        String object_3 = " ";
        boolean variable;

        variable = object_1.isEmpty();
        System.out.println("object_1 is empty : " +variable);

        variable = object_2.isEmpty();
        System.out.println("object_2 is empty : " +variable);

        variable = object_3.isEmpty();
        System.out.println("object_3 is empty : " +variable);
    }
}
