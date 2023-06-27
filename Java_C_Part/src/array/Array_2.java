package array;

// getting input from user in one D array_name

import java.util.Scanner;

public class Array_2 {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        int array_name[] = new int[4]; // declaring & allocating memory for array_name
        
        System.out.print("Enter four integers : "); // for taking input
        for (int i = 0; i < 4; i++) {
            array_name[i] = object.nextInt();
        }

        System.out.println("Entered : "); // for displaying array_name elements
        for (int i = 0; i < 4; i++) {
            System.out.println("array[" + i + "] : " + array_name[i]);
        }
    }
}