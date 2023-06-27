package array_jagged;  // printing jagged array

public class Jagged_Array_3
{
    public static void main(String[] args)
    {
        int array[][] = new int[3][]; // declaration and memory allocation of jagged array

        array[0] = new int[2]; // first row has two columns
        array[1] = new int[3]; // second row has three columns
        array[2] = new int[1]; // third row has one column

        // initialization of Jagged array
        array[0][0] = 11;
        array[0][1] = 22;
        array[1][0] = 33;
        array[1][1] = 44;
        array[1][2] = 55;
        array[2][0] = 66;

        System.out.println("array[1][1] : " +array[1][1]);

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
