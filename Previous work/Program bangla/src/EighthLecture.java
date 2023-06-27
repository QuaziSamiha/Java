import java.util.Scanner;

public class EighthLecture
{
    static Scanner sc = new Scanner(System.in);//for taking input
    public static void main(String[] args)
    {
                                         // 1 2 4 5
        // 2D array                     //  2 4 5 9
        int[][] twoDarr = new int[2][4];
        //initializing
        twoDarr[0][0] = 1;
        twoDarr[0][1] = 2;
        twoDarr[0][2] = 4;
        twoDarr[0][3] = 5;

        twoDarr[1][0] = 2;
        twoDarr[1][1] = 4;
        twoDarr[1][2] = 5;
        twoDarr[1][3] = 9;
//        System.out.println("Enter input for two D array : ");
//        for(int row = 0; row < 2; row++)
//        {
//            for (int column = 0; column < 4; column++)
//            {
//                System.out.print("2Darray["+row+"]["+column+"]:");
//                twoDarr[row][column] = sc.nextInt();//for taking integer input
//            }
//        }
        System.out.println("Two D array : ");
        //using try catch block
        try {
            for(int row = 0; row < 3; row++)//here given row less than but the array has two row
            {//so error will be occur
                for (int column = 0; column < 4; column++)
                {
                    System.out.print(twoDarr[row][column]+"\t");
                }
                System.out.println();//for next row
            }
        }catch (Exception e){//here e can be any name; Exception is a class
          e.printStackTrace();//it will show the error after running the program
        }
        //jodi try catch block use kora na hoto tahole error dekhato and okhanei program stop hoea
        //jeto....Thank You print hoto na...but try catch block use korai error ta skip kore
        //terpor ja ase program a segulao run korbe...akhane jmn Thank You print korbe
        System.out.println("Thank You!!!");

        int[][] twoDarr1 = new int[2][4];
        //initializing
        twoDarr1[0][0] = 1;
        twoDarr1[0][1] = 2;
        twoDarr1[0][2] = 4;
        twoDarr1[0][3] = 5;

        twoDarr1[1][0] = 2;
        twoDarr1[1][1] = 4;
        twoDarr1[1][2] = 5;
        twoDarr1[1][3] = 9;
        try {
            System.out.print("Enter a number : ");
            int number = sc.nextInt();
            while (number!=200)
            {
                System.out.println(100/number);//here if we take input zero it will stop the loop
                //and will give a massage of error for dividing by zero and then run the rest program
                System.out.print("Enter a number : ");
                number = sc.nextInt();
            }
        }catch (Exception e){//here e can be any name; Exception is a class
            e.printStackTrace();//it will show the error after running the program
        }
        System.out.println("Thank You!!!");

        int number = 0;
        try {
            System.out.print("Enter a number : ");
            number = sc.nextInt();
            while (number<50)
            {
                System.out.println(100/number);
                number++;
            }
        }catch (Exception e){//here e can be any name; Exception is a class
            e.printStackTrace();//it will show the error(if exist) after running the program
        }finally {
            number++;
            System.out.println("Come out of try catch block, with number "+number);
        }
        System.out.println("Thank You!!!");
    }
}
