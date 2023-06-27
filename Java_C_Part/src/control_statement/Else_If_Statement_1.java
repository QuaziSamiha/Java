package control_statement;

import java.util.Scanner;

public class Else_If_Statement_1 {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        int variable;
        System.out.print("Enter an integer : ");
        variable = object.nextInt();

        if(variable > 0){
            System.out.println("Positive");
        }
        else if(variable < 0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Zero");
        }
    }
}

/*
else..if : to show a multi-way decision based on several conditions, we use else if statement.
*/
