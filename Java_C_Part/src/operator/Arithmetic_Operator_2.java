package operator;

import java.util.Scanner;

public class Arithmetic_Operator_2 {

    public static void main(String[] args) {

        int variable_1, variable_2, variable; // declaring variable

        Scanner object_name = new Scanner(System.in); // creating object for taking input

        // taking input
        System.out.print("Enter first integer : ");
        variable_1 = object_name.nextInt();
        System.out.print("Enter second integer : ");
        variable_2 = object_name.nextInt();

        variable = variable_1 + variable_2;
        System.out.println("Addition : " +variable);

        variable = variable_1 - variable_2;
        System.out.println("Subtraction : " +variable);

        variable = variable_1 * variable_2;
        System.out.println("Multiplication : " +variable);

        double variable_3 = (double) variable_1 / variable_2; // type cast
        System.out.println("Division : " +variable_3);
        System.out.printf("Division : %.3f \n", variable_3);

        variable = variable_1 % variable_2;
        System.out.println("Modulus : " +variable);
    }
}
