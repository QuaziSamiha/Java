package basic_knowledge;

import java.util.Random;
import java.util.Scanner;

public class Random_Number_3 {

    public static void main(String[] args) {

        Random object = new Random();
        int v, n;

        System.out.print("Enter how many random numbers : ");
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();

        for(int i = 0; i < n; i++){
            v = object.nextInt(100)+1; // 1 to 100
            System.out.println(v);
        }
    }
}
