public class ThirdLecture {
    public static void main(String[] args)
    {                                 // 1 2 4 5
     // 2D array                     //  2 4 5 9
        int[][] arr1 = new int[2][4];
        //initializing
        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 4;
        arr1[0][3] = 5;

        arr1[1][0] = 2;
        arr1[1][1] = 4;
        arr1[1][2] = 5;
        arr1[1][3] = 9;

        arr1[1][2] += (arr1[0][2]+arr1[0][3]);
        System.out.println("arr1[1][2] : "+arr1[1][2]);

    }
}
// Main class run hoise..