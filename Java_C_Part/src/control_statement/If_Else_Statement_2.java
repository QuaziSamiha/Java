package control_statement;

import java.util.Scanner;

public class If_Else_Statement_2 {

    public static void main(String[] args) {

        int v1, v2;

        Scanner object = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        v1 = object.nextInt();
        System.out.print("Enter an integer : ");
        v2 = object.nextInt();

        if(v1 > v2) {
            System.out.println("First Block");
        }
        else {
            System.out.println("Second Block");
        }

        System.out.println("End");
    }
}

/*
if else statement : it is used when a different sequence of instructions is to be executed depending on the logical
value (true or false) of the condition evaluated.
*/