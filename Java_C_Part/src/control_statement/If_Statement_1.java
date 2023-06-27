package control_statement; // any meaningful expression is called a statement

import java.util.Scanner;

public class If_Statement_1 {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        int variable;
        System.out.print("Enter an integer : ");
        variable = object.nextInt();

        if(variable > 0){
            System.out.println("Positive");
        }
    }
}
/*
Decision statement : It means executing different sections of code depending on a specific condition or the value of variable.
if, if...else, else...if, switch

if statement : it is used to execute an instruction or sequence/block of instructions only if a condition is fulfilled.
*/
