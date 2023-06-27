package array_jagged;  // dynamic memory allocation of jagged array

import java.util.Scanner;

public class Jagged_Array_6
{
    public static void main(String[] args)
    {
        Scanner object = new Scanner(System.in);

        System.out.print("Enter number of row of jagged array : ");
        int variable_1 = object.nextInt(); // taking input of row size

        int array[][] = new int[variable_1][]; // declaration and dynamically memory allocation

        for (int i = 0; i < variable_1; i++) // int i = 0; i < array_1.length; i++
        {
            System.out.print("Number of elements in row " + (i + 1) + " : ");
            int variable_2 = object.nextInt(); //taking input for column size
            array[i] = new int[variable_2];
        }

        System.out.println("Give Input in Jagged Array : ");
        for (int i = 0; i < array.length; i++) // for row
        {
            for (int j = 0; j < array[i].length; j++) // for column
            {
                array[i][j] = object.nextInt();
            }
        }

        System.out.println("Jagged Array : ");
        for (int i = 0; i < array.length; i++) //for row
        {
            for (int j = 0; j < array[i].length; j++) //for column
            {
                System.out.print(array[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
