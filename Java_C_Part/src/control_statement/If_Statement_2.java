package control_statement; // finding even or odd number

import java.util.Scanner;

public class If_Statement_2 {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        int variable;
        System.out.print("Enter an integer : ");
        variable = object.nextInt();

        if(variable%2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}