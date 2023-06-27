package string_class;  // finding string length

public class String_Class_1 {

    public static void main(String[] args) {

        String object_1 = "Java Programming";
        String object_2 = new String("Java Programming");
        String object_3;
        object_3 = new String("August,2020");

        System.out.println("object_1 : " +object_1);
        System.out.println("object_2 : " +object_2);
        System.out.println("object_3 : " +object_3);

        int variable = object_1.length();
        System.out.println("string length : " +variable);
    }
}
