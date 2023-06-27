package wrapper_class;

// hexadecimal, binary, octal to decimal conversion

import java.util.Scanner;

public class WrapperClass_11 {

    public static void main(String[] args) {

        String object_1;
        Integer object_2;

        Scanner ob = new Scanner(System.in);

        // binary to decimal ( 0 to 1)
        System.out.print("Enter a binary value : ");
        object_1 = ob.next();
        object_2 = Integer.parseInt(object_1,2);
        System.out.println("binary to decimal : " +object_2);

        // octal to decimal (0 to 7)
        System.out.print("Enter a octal value : ");
        object_1 = ob.next();
        object_2 = Integer.parseInt(object_1,8);
        System.out.println("octal to decimal : " +object_2);

        // hexadecimal to decimal (0 to 15)
        System.out.print("Enter a hexadecimal value : ");
        object_1 = ob.next();
        object_2 = Integer.parseInt(object_1,16);
        System.out.println("hexadecimal to decimal : " +object_2);

         // (0 to 15)
        System.out.print("Enter a hexadecimal value : ");
        object_1 = ob.next();
        object_2 = Integer.parseInt(object_1,16);
        System.out.println("hexadecimal to decimal : " +object_2);
    }
}

