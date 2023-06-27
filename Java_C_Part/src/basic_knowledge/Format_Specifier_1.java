package basic_knowledge; // here we using printf( ) method

public class Format_Specifier_1 {

    public static void main(String[] args) {

        boolean v1 = false;
        System.out.printf("boolean = %b \n", v1);

        short v2 = 32767;
        System.out.printf("short = %d \n", v2);

        int v3 = 2147483647;
        System.out.printf("integer : %d \n", v3);

        char v4 = 'A';
        System.out.printf("char = %c \n", v4);

        float v5 = 13.89f;
        System.out.printf("float = %f \n", v5);
        System.out.printf("float = %.3f \n", v5);

        double v6 = 24.8;
        System.out.printf("double = %f \n", v6);
        System.out.printf("double = %.2f \n", v6);
    }
}
