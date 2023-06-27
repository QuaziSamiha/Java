package control_statement;

import java.util.Scanner;

public class If_Else_Statement_1 {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        int variable;
        System.out.print("Enter an integer : ");
        variable = object.nextInt();

        if(variable > 0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Negative");
        }
    }
}
