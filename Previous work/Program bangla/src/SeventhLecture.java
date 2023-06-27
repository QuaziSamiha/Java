import java.util.Scanner;

public class SeventhLecture
{
    static Scanner sc = new Scanner(System.in);//for taking input
    public static void main(String [] args)
    {   //using for loop
        for(int i = 1; i < 5; i++)
        {
            System.out.print("  "+i);
        }
        System.out.print("\n");
        for(int i = 1; i < 200; i+=67)
        {
            System.out.print("  "+i);
        }
        System.out.print("\n");
        for(int i = 1; i < 100; i*=2)
        {
            System.out.print("  "+i);
        }
        //using nested for loop
                                         // 1 2 4 5
        // 2D array                     //  2 4 5 9
        int[][] twoDarr = new int[2][4];
        //initializing
//        twoDarr[0][0] = 1;
//        twoDarr[0][1] = 2;
//        twoDarr[0][2] = 4;
//        twoDarr[0][3] = 5;
//
//        twoDarr[1][0] = 2;
//        twoDarr[1][1] = 4;
//        twoDarr[1][2] = 5;
//        twoDarr[1][3] = 9;
        System.out.println("Enter input for two D array : ");
        for(int row = 0; row < 2; row++)
        {
            for (int column = 0; column < 4; column++)
            {
                System.out.print("2Darray["+row+"]["+column+"]:");
                twoDarr[row][column] = sc.nextInt();//for taking integer input
            }
        }
        System.out.println("Two D array : ");
        for(int row = 0; row < 2; row++)
        {
            for (int column = 0; column < 4; column++)
            {
                System.out.print(twoDarr[row][column]+"\t");
            }
            System.out.println();//for next row
        }
    }
}
