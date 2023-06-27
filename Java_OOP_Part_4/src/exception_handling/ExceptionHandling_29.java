package exception_handling;  // user defined checked exception (8:14pm,13 August,2020)

import java.util.Scanner;

public class ExceptionHandling_29 {
    public static void main(String[] args) {

        UserDefinedException object = new UserDefinedException();

        object.method(10000);
    }
}

class LowBalanceException extends Exception{

    LowBalanceException(){ // constructor

        super("Insufficient Balance"); // passing a string to superclass
    }
}

class UserDefinedException{

    public void method(int p) { // method = atm, p = m

        int v1 = p; // let v1 = money

        Scanner object = new Scanner(System.in);
        System.out.print("withdraw amount : ");
        int v2 = object.nextInt();

        if(v1 < v2){ // money < withdraw

            try {
                throw new LowBalanceException();
            }
            catch (LowBalanceException e) {

                System.out.println(e);
            }
        }
        else {
            int v3 = v1 - v2;
            System.out.println("remain money : " +v3);
        }
    }
}

/*
output 1 :
withdraw amount : 5000
remain money : 5000

Process finished with exit code 0
---------------------------------------------------
output 2 :
withdraw amount : 12000
exception_handling.LowBalanceException: Insufficient Balance

Process finished with exit code 0

 */