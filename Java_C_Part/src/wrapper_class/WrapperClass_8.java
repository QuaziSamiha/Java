package wrapper_class;

// decimal to hexadecimal, binary, octal conversion

public class WrapperClass_8 {

    public static void main(String[] args) {

        int variable;
        String object;

        // decimal to binary
        variable = 5;
        object = Integer.toBinaryString(variable);
        System.out.println("decimal to binary : " +object);

        // decimal to octal
        variable = 8;
        object = Integer.toOctalString(variable);
        System.out.println("decimal to octal : " +object);

        // decimal to hexadecimal
        variable = 16;
        object = Integer.toHexString(variable);
        System.out.println("decimal to hexadecimal : " +object);
    }
}
