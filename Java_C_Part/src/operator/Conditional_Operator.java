package operator;

import java.util.Scanner;

public class Conditional_Operator {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        int v1, v2, v3;
        System.out.print("Enter an integer : ");
        v1 = object.nextInt();
        System.out.print("Enter an integer : ");
        v2 = object.nextInt();

        v3 = v1 > v2? v1 : v2; // conditional operator
        System.out.println("maximum : " +v3);
    }
}
