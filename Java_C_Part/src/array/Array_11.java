package array;

// calculation of 2D array

public class Array_11 {

    public static void main(String[] args) {

        int[][] array = new int[2][4]; // declaring & allocating memory

        array[0][0] = 10;
        array[0][1] = 22;
        array[0][2] = array[0][0]+array[0][1];
        array[0][3] = array[0][0]+40;
        array[1][0] = 52;
        array[1][1] = 62;
        array[1][2] = array[0][3]+2;
        array[1][3] = 82;

        System.out.println("2D array : ");
        for(int i = 0; i < 2; i++) {  // printing elements of array_2
            for(int j = 0; j < 4; j++) {
                System.out.print(array[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
