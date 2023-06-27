package basic_knowledge; // primitive data types

public class Data_Type {

    public static void main(String[] args) {

        byte y; // 1 byte or 8 bits
        short s; // 2 bytes or 16 bits
        int i; // 4 bytes or 32 bits
        long l; // 8 bytes or 16 bits
        boolean b; // 1 byte
        char c; // 2 bytes or 16 bits
        float f; // 4 bytes or 32 bits
        double d; // 8 bytes or 16 bits

        y = 127;
        System.out.println("byte = " +y);
        s = 32767;
        System.out.println("short = " +s);
        i = 2147483647;
        System.out.println("integer = " +i);
        b = true;
        System.out.println("boolean = " +b);
        b = false;
        System.out.println("boolean = " +b);
        c = 'A';
        System.out.println("char = " +c);
        f = 10.2f;
        System.out.println("float = " +f);
        d = 10.2;
        System.out.println("double = " +d);

    //  s = 327678; // showing error because of out of range
    //  y = 128;  // showing error because of out of range
    //  f = 10.2 // showing error because of lacking of f
    //  int i = 10.5; // it will show an error

        int v = 12; // dynamic initialization
    }
}
