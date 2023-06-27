import java.util.Scanner;
//A program to make pascal triangle
public class Practice2
{
    static Scanner sc = new Scanner(System.in);//for taking input
    public static void main(String[] args)
    {
        System.out.println("Enter -1 to exit");
        System.out.print("Enter the length of pascal triangle : ");
        int input = sc.nextInt();
        while (input!=-1)
        {
            if(input<-1 || input>20)
            {
                System.out.println("Please enter something between -1~20");
                input = sc.nextInt();
                continue;
            }
            printPascalTriangle(input);//calling method and passing value
            System.out.println("Please enter something between -1~20");
            input = sc.nextInt();
        }
    }
    static void printPascalTriangle(int length)
    {
        int[][] pascal = new int[length][length];
        for(int i = 0; i < length; i++)
        {
              pascal[0][i] = 1;//each element of first row is one
              pascal[i][0] = 1; //each element of first column is one
        }
        for(int row = 1; row < length; row++)
        {
           for (int column = 1; column < length-row; column++)
           {
               pascal[row][column] = pascal[row][column-1]+pascal[row-1][column];
           }
        }
        System.out.println("Pascal Triangle : ");
        for(int row = 0; row < length; row++)
        {
            for (int column = 0; column < length-row; column++)
            {
                System.out.print(pascal[row][column]+"\t");
            }
            System.out.println();
        }
    }
}
//pascal triangle....length=4
//1 1 1 1
//1 2 3
//1 3
//1