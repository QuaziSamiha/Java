package string_builder;

public class StringBuilder_2 {

    public static void main(String[] args) {

        StringBuilder object = new StringBuilder("Java");

        System.out.println("Before : ");
        System.out.println("string = " +object);

        object.append(" Programming");

        System.out.println("\nAfter : ");
        System.out.println("string = " +object);

        object.append(123.4343); // adding double
        System.out.println("string = " +object);
    }
}
