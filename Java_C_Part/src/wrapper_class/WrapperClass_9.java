package wrapper_class;

// hexadecimal, binary, octal to decimal conversion

public class WrapperClass_9 {

    public static void main(String[] args) {

        String object_1;
        Integer object_2;

        // binary to decimal
        object_1 = "101"; // ( 0 to 1)
        object_2 = Integer.parseInt(object_1,2);
        System.out.println("binary to decimal : " +object_2);

        // octal to decimal
        object_1 = "10"; // (0 to 7)
        object_2 = Integer.parseInt(object_1,8);
        System.out.println("octal to decimal : " +object_2);

        // hexadecimal to decimal
        object_1 = "10"; // (0 to 15)
        object_2 = Integer.parseInt(object_1,16);
        System.out.println("hexadecimal to decimal : " +object_2);

        object_1 = "A"; // (0 to 15)
        object_2 = Integer.parseInt(object_1,16);
        System.out.println("hexadecimal to decimal : " +object_2);
    }
}

