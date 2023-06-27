package string_buffer; // use of setLength() method

public class StringBuffer_4 {

    public static void main(String[] args) {

        StringBuffer object = new StringBuffer("Java Programming");

        System.out.println("Before : ");
        System.out.println(object);

        object.setLength(6);

        System.out.println("After  : ");
        System.out.println(object);
    }
}
