package array;  // getting input from user in two D array

import java.util.Scanner;

public class Array_9 {

    public static void main(String[] args) {

        int[][] array = new int [3][4];

        Scanner object = new Scanner(System.in);

        System.out.print("Enter array element : "); // 12 elements
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                array[i][j] = object.nextInt();
            }
        }

        System.out.println("Entered 2 D array : ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(array[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
