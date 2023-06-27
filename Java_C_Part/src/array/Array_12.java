package array;

// 2D array length

public class Array_12 {

    public static void main(String[] args) {

        int[][] array_1 = new int[5][8];
        System.out.println("row size of array_1 (array_1.length) : " +array_1.length);
        System.out.println("column size of array_1 (array_1[0].length) : " +array_1[0].length);

        int array_2[][] = new int[3][2];
        int variable_1 = array_2.length; // finding row
        int variable_2 = array_2[0].length; // finding column
        System.out.println("row size of array_2 (array_2.length) : " +variable_1);
        System.out.println("column size of array_2 (array_2[0].length) : " +variable_2);
    }
}
