package string_builder;

public class StringBuilder_3 {

    public static void main(String[] args) {

        StringBuilder object = new StringBuilder("Java");

        System.out.println("Before reversing : ");
        System.out.println("string = " + object);

        object.reverse();

        System.out.println("\nAfter reversing : ");
        System.out.println("string = " + object);
    }
}
