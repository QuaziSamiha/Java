package wrapper_class;

// decimal to hexadecimal, binary, octal conversion

import java.util.Scanner;

public class WrapperClass_10 {

    public static void main(String[] args) {

        int variable;
        String object;

        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a decimal value : ");
        variable = ob.nextInt();

        // decimal to binary
        object = Integer.toBinaryString(variable);
        System.out.println("decimal to binary : " +object);

        // decimal to octal
        object = Integer.toOctalString(variable);
        System.out.println("decimal to octal : " +object);

        // decimal to hexadecimal
        object = Integer.toHexString(variable);
        System.out.println("decimal to hexadecimal : " +object);
    }
}
