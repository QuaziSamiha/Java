package array;

// two D array : double indexed variable is referred to two D array

public class Array_8 {

    public static void main(String[] args) {

        int array_1[][]; // declaring
        array_1 = new int[3][4]; // allocating memory

        int array_2[][] = new int[2][4]; // declaring & allocating memory

        int[][] array_3; // declaring
        array_3 = new int[3][4]; // allocating memory

        int[][] array_4 = new int[2][4]; // declaring & allocating memory

        // initializing
        array_2[0][0] = 12;
        array_2[0][1] = 22;
        array_2[0][2] = 32;
        array_2[0][3] = 42;
        array_2[1][0] = 52;
        array_2[1][1] = 62;
        array_2[1][2] = 72;
        array_2[1][3] = 82;

        int array_5[][] = {{12,13,14,15},{22,23,24,25},{32,33,34,35}}; //declaring, allocating memory & initializing

        System.out.println("array_5[1][2] : " +array_5[1][2]);
        System.out.println("array_2[0][3] : " +array_2[0][3]);
    }
}
