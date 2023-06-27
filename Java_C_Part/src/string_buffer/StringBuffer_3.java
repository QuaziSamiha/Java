package string_buffer; // use of delete() method

public class StringBuffer_3 {

    public static void main(String[] args) {

        StringBuffer object = new StringBuffer("Java Programming");

        System.out.println("\nBefore deleting from index 3 to 9 : ");
        System.out.println(object);

        object.delete(3,9); // passing index as a range

        System.out.println("\nAfter deleting from index 3 to 9 : ");
        System.out.println(object);
    }
}
