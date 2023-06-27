package operator;

public class Bitwise_Operator_1 {

    public static void main(String[] args) {

        int v1 = 32;
        int v2 = 12;

        int v3;

        v3 = v1 & v2;  // bitwise AND
        System.out.println("v1 & v2 : " +v3);

        v3 = v1 | v2; // bitwise OR
        System.out.println("v1 | v2 : " +v3);

        v3 = v1 ^ v2; // bitwise ExOR
        System.out.println("v1 ^ v2 : " +v3);

        v3 = v1>>3; // left shift
        System.out.println("v1 >> 3 : " +v3);

        v3 = v1<<3; // right shift
        System.out.println("v1 << 3 : " +v3);
    }
}
