package string_buffer;  // use of reverse() method

public class StringBuffer_2 {

    public static void main(String[] args) {

        StringBuffer object = new StringBuffer("Java");

        System.out.println("Before reverse : ");
        System.out.println(object);

        object.reverse();

        System.out.println("After reverse : ");
        System.out.println(object);
    }
}
