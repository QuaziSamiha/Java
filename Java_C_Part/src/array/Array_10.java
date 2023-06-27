package array;

// initialization a 2D array with a 2D array

public class Array_10 {

    public static void main(String[] args) {

        int array_1[][] = {{11,22,33},{44,55,66}};//declaring, allocating memory & initializing

        int array_2[][]; // declaring another array

        array_2 = array_1; // initialization & allocating memory of array_2

        System.out.println("2D array : ");
        for(int i = 0; i < 2; i++) {  // printing elements of array_2
            for(int j = 0; j < 3; j++) {
                System.out.print(array_2[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
