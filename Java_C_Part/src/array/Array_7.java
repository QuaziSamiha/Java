package array; // dynamic memory allocation in one D array

import java.util.Scanner;

public class Array_7 {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        System.out.print("Enter how many elements : ");
        int variable = object.nextInt(); // taking array size as input

        int array[] = new int[variable]; // declaring array & allocating memory dynamically

        System.out.print("Enter " + variable + " integers : ");

        for (int i = 0; i < array.length; i++) {  // for taking input
            array[i] = object.nextInt();
        }

        for (int i = 0; i < array.length; i++) { // for displaying
            System.out.println("array[" + i + "] : " + array[i]);
        }
    }
}
