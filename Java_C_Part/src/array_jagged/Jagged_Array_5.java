package array_jagged;  // getting input from user in jagged array

import java.util.Scanner;

public class Jagged_Array_5
{
    public static void main(String[] args)
    {
        int[][] array; // declaration of jagged array
        array = new int[3][]; // defining row size

        array[0] = new int[3]; // first row has three columns
        array[1] = new int[2]; // second row has two columns
        array[2] = new int[1]; // third row has one column

        Scanner object = new Scanner(System.in);

        System.out.print("Give Input in Jagged Array : ");
        for (int i = 0; i < array.length; i++) // for row
        {
            for (int j = 0; j < array[i].length; j++) // for column
            {
                array[i][j] = object.nextInt();
            }
        }

        System.out.println("Jagged Array : ");
        for (int i = 0; i < array.length; i++) // for row
        {
            for (int j = 0; j < array[i].length; j++) // for column
            {
                System.out.print(array[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
