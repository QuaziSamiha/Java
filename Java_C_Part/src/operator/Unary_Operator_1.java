package operator;

public class Unary_Operator_1 {

    public static void main(String[] args) {

        int variable_1 = 10;
        int variable_2;

        variable_2 = +variable_1; // using unary plus
        System.out.println(variable_2); // 10

        variable_2 = -variable_1; // using unary minus
        System.out.println(variable_2); // -10

        variable_1 = -28;

        variable_2 = +variable_1; // using unary plus
        System.out.println(variable_2); // -28

        variable_2 = -variable_1; // using unary minus
        System.out.println(variable_2); // 28
    }
}
