package array_jagged;  // jagged array length

public class Jagged_Array_2
{
    public static void main(String[] args)
    {
        int array[][] = new int[3][];

        array[0] = new int[2];         // first row has two columns
        array[1] = new int[3];         // second row has three columns
        array[2] = new int[1];         // third row has one column

        System.out.println("row size of array : " +array.length);

        System.out.println("number of elements in 1st row : " +array[0].length);
        int variable = array[1].length;
        System.out.println("number of elements in 2nd row : " +variable);
        System.out.println("number of elements in 3rd row : " +array[2].length);
    }
}
