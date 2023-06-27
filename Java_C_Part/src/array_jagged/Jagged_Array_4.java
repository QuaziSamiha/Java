package array_jagged;  // initializing jagged array using 1D array

public class Jagged_Array_4
{
    public static void main(String[] args)
    {
        int jagged_array[][] = new int[3][]; // declaration and memory allocation of jagged array

        int[] array_1 = {11,21,31};       // 1D array with three element
        int[] array_2 = {41,51};         // 1D array with two element
        int[] array_3 = {61};            // 1D array with one element
        jagged_array[0] = array_1;        // initialization 1st row of jagged array by 1D array
        jagged_array[1] = array_2;        // initialization 2nd row of jagged array by 1D array
        jagged_array[2] = array_3;        // initialization 3rd row of jagged array by 1D array

        System.out.println("Jagged Array : ");
        for (int i = 0; i < jagged_array.length; i++) //for row
        {
            for (int j = 0; j < jagged_array[i].length; j++) //for column
            {
                System.out.print(jagged_array[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
