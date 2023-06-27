package control_statement;  // nest if...else statement

import java.util.Scanner;

public class If_Else_Statement_3 {

    public static void main(String[] args) {

        int v1, v2, v3, v4;

        Scanner object = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        v1 = object.nextInt();
        System.out.print("Enter an integer : ");
        v2 = object.nextInt();
        System.out.print("Enter an integer : ");
        v3 = object.nextInt();
        System.out.print("Enter an integer : ");
        v4 = object.nextInt();


        if(v1 < v2) {
            System.out.println("Block_1");
            if(v3 > v4) {
                System.out.println("Block_2");
            }
            else {
                System.out.println("Block_3");
            }
        }
        else {
            System.out.println("Block_4");
        }

        System.out.println("End");

    }
}

/*
nested if..else : in nested if..else statement, an entire if.. else construct is written either the body of
the if statement or the body of an else statement.
*/