package array; // dynamic memory allocation in 2D array

import java.util.Scanner;

public class Array_13 {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        System.out.print("Enter row size : ");
        int variable_1 = object.nextInt();
        System.out.print("Enter column size : ");
        int variable_2 = object.nextInt();

        int[][] array = new int[variable_1][variable_2];

        System.out.print("Enter " +variable_1*variable_2+ " elements for 2D array : ");
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[0].length; j++) {
                array[i][j] = object.nextInt();
            }
        }

        System.out.println("2D array : ");
        for(int i = 0; i < variable_1; i++) {
            for(int j = 0; j < variable_2; j++) {
                System.out.print(array[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
