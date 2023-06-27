package string_buffer;  // use of append() method

// StringBuffer is class
// difference between String and StringBuffer class is we can change string in StringBuffer but we cannot do it in String class

public class StringBuffer_1 {

    public static void main(String[] args) {

        StringBuffer object = new StringBuffer("Java");
        System.out.println(object);

        // we can add any data type with a string using append() method

        object.append(" Programming "); // adding string and adding space before & after the new string
        System.out.println(object);

        object.append(2020); // adding integer data type
        System.out.println(object);
    }
}
