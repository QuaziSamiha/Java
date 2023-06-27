package string_builder;  // use of append() method

// StringBuilder is a class like StringBuffer

public class StringBuilder_1 {

    public static void main(String[] args) {

        StringBuilder object = new StringBuilder();

        System.out.println("Before : ");
        System.out.println("string = " +object);

        object.append("Java Programming");

        System.out.println("\nAfter  : ");
        System.out.println("string = " +object);

    }
}
