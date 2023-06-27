package exception_handling; // user defined checked exception (7:59pm,13 August,2020)

import java.util.Scanner;

public class ExceptionHandling_28 {
    public static void main(String[] args) {

        int v1 = 10000; // let v1 = money

        Scanner object = new Scanner(System.in);

        System.out.print("withdraw amount : ");
        int v2 = object.nextInt();

        int v3 = v1 - v2;
        System.out.println("remain money : " +v3);
    }
}

/*

output 1 :
withdraw amount : 5000
remain money : 5000

Process finished with exit code 0

output 2 :
withdraw amount : 12000
remain money : -2000  // exception

Process finished with exit code 0

 */