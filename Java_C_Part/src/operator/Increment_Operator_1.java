package operator; // unary operator

public class Increment_Operator_1 {

    public static void main(String[] args) {

        int v1 = 25;
        int v2;
        // post increment
        v2 = v1++;
        System.out.println("v2 : " +v2);  // 25

        v2 = v1;
        System.out.println("v2 : " +v2);  // 26
//-------------------------------------------------------------------------------------------------------------
        int v3 = 14;
        int v4;
        // pre increment
        v4 = ++v3;
        System.out.println("v4 : " +v4);  // 15

        v4 = v4;
        System.out.println("v4 : " +v4);  // 15
    }
}
