package string_buffer;

public class StringBuffer_6 {

    public static void main(String[] args) {

        String object_1 = "madam";

        StringBuffer object_2 = new StringBuffer(object_1);

        String object_3 = object_2.reverse().toString();

        if(object_1.equals(object_3)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
