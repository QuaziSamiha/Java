package operator;

public class Arithmetic_Operator_1 {

    public static void main(String[] args) {

        int variable_1 = 5, variable_2 = 2, variable; // declaring variable

        variable = variable_1 + variable_2;
        System.out.println("Addition : " +variable);

        variable = variable_1 - variable_2;
        System.out.println("Subtraction : " +variable);

        variable = variable_1 * variable_2;
        System.out.println("Multiplication : " +variable);

        variable = variable_1 / variable_2;
        System.out.println("Division : " +variable);

        variable = variable_1 % variable_2;
        System.out.println("Modulus : " +variable);
    }
}
