package array;  // dynamic memory allocation in one D array

import java.util.Scanner;

public class Array_6 {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        System.out.print("Enter how many elements : ");
        int variable = object.nextInt(); // taking array size as input

        int array[] = new int[variable]; // declaring array & allocating memory dynamically

        System.out.print("Enter " +variable+ " integer as array elements : ");

        for(int i = 0; i < variable; i++) { // for taking input
            array[i] = object.nextInt();
        }

        for(int i = 0; i < variable; i++) {  // for displaying
            System.out.println("array[" +i+ "] : " +array[i]);
        }

        System.out.println("array.length : " +array.length);
    }
}
