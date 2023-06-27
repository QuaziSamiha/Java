package string_class;  // use of contains() method

public class String_Class_4 {

    public static void main(String[] args) {

        String object = "Java Programming";
        boolean variable;

        variable = object.contains("Jam");
        System.out.println("Is the string containing \"Jam\" : " +variable);

        variable = object.contains("Jav");
        System.out.println("Is the string containing \"Jav\" : " +variable);

        if(object.contains("Programming")){
            System.out.println("string is containing \"Programming\" ");
        }
        else {
            System.out.println("string is not containing \"Programming\" ");
        }
    }
}
