package array_jagged;  // jagged array declaration & initialization

public class Jagged_Array_1
{
    public static void main(String[] args)
    {
        int array_1[][]; // declaration of jagged array
        array_1 = new int[3][]; // memory allocation, column size has to be remained blank

        // defining number of elements in each row
        array_1[0] = new int[3]; // first row has three columns
        array_1[1] = new int[2]; // second row has two columns
        array_1[2] = new int[1]; // third row has one column

        //Initialization of Jagged array
        array_1[0][0] = 11;
        array_1[0][1] = 21;
        array_1[0][2] = 31;
        array_1[1][0] = 41;
        array_1[1][1] = 51;
        array_1[2][0] = 61 ;
//----------------------------------------------------------------------------------------------------------------------
        int array_2[][] = new int[3][]; // declaration and memory allocation of jagged array

        array_2[0] = new int[2];  // first row has two columns
        array_2[1] = new int[3];  // second row has three columns
        array_2[2] = new int[1];  // third row has one column
//----------------------------------------------------------------------------------------------------------------------
        int[][] array_3; //  declaration of jagged array
        array_3 = new int[2][]; // memory allocation of jagged array

        int[][] array_4 = new int[3][]; // declaration and memory allocation of jagged array

        int[] arr_1 = {11,22,33}; // 1D array with three element
        int[] arr_2 = {44,55,77,88}; // 1D array with two element
        int[] arr_3 = {66}; // 1D array with one element
        array_4[0] = arr_1; // initialization 1st row of jagged array by 1D array
        array_4[1] = arr_2; // initialization 2nd row of jagged array by 1D array
        array_4[2] = arr_3; // initialization 3rd row of jagged array by 1D array
    }
}

/*
Array which may contain different number of element in each row.
*/

