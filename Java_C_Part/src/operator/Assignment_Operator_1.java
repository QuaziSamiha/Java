package operator;

public class Assignment_Operator_1 {

    public static void main(String[] args) {

        int variable_1 = 3;
        int variable_2 = 2;

        variable_1 += variable_2; // variable_1 = variable_1 + variable_2
        System.out.println("variable_1 : " +variable_1); // 3+2 = 5

        variable_1 -= variable_2; // variable_1 = variable_1 - variable_2
        System.out.println("variable_1 : " +variable_1); // 5-2 = 3

        variable_1 *= variable_2; // variable_1 = variable_1 * variable_2
        System.out.println("variable_1 : " +variable_1); // 3*2 = 6

        variable_1 /= variable_2; // variable_1 = variable_1 / variable_2
        System.out.println("variable_1 : " +variable_1); // 6/2 = 3

        variable_1 %= variable_2; // variable_1 = variable_1 % variable_2
        System.out.println("variable_1 : " +variable_1); // 3%2 = 1

    }
}
