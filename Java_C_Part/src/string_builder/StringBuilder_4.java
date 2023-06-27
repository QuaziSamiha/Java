package string_builder;  // use delete() method

public class StringBuilder_4 {

    public static void main(String[] args) {

        StringBuilder object = new StringBuilder("Java Programming");

        System.out.println("Before deleting : ");
        System.out.println("string = " + object);

        object.delete(12,16);

        System.out.println("\nAfter deleting from index 12 to 16 : ");
        System.out.println("string = " + object);
    }
}
