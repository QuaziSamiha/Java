package operator;  // the outcome of these operation is a boolean value

// used to compare the value of operands (or expressions) to produce a logical value. A logical value is either true or false

import java.util.Scanner;

public class Relational_Operator_1 {

    public static void main(String[] args) {

        int variable_1, variable_2;

        Scanner object = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        variable_1 = object.nextInt();
        System.out.print("Enter an integer : ");
        variable_2 = object.nextInt();

        boolean variable_3 = variable_1 < variable_2;
        System.out.println("less than : " +variable_3);

        System.out.println("less than or equal to : " +(variable_1 <= variable_2));

        boolean variable_4 = variable_1 > variable_2;
        System.out.println("greater than : " +variable_4);

        System.out.println("greater than or equal to : " +(variable_1 >= variable_2));

        boolean variable_5 = variable_1 == variable_2;
        System.out.println("equal to : " +variable_5);

        System.out.println("not equal to : " +(variable_1 != variable_2));
    }
}
