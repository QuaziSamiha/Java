package operator;

public class Logical_Operator_1 {

    public static void main(String[] args) {

        int variable_1 = 2, variable_2 = 5, variable_3 = 2, variable_4 = 8;

        boolean variable_5 = (variable_1 < variable_2) && (variable_1 < variable_4); // AND operator
        System.out.println("Result : " +variable_5);

        boolean variable_6 = (variable_1 < variable_2) && (variable_1 > variable_4);
        System.out.println("Result : " +variable_6);

        boolean variable_9 = (variable_1 < variable_2) || (variable_1 > variable_4); // OR operator
        System.out.println("Result : " +variable_9);

        boolean variable_7 = !(variable_1 < variable_2); // NOT Operator
        System.out.println("Result : " +variable_7);

        boolean variable_8 = !(variable_1 < variable_3); // variable_1 is not less than variable_3
        System.out.println("Result : " +variable_8); // true
    }
}
