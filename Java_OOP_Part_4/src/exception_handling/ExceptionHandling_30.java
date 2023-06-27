package exception_handling;  // user defined unchecked exception (8:42pm,13 August,2020)

import java.util.Scanner;

public class ExceptionHandling_30 {
    public static void main(String[] args) {

        User_DefinedException object = new User_DefinedException();
        object.method(10000);
    }
}

class Low_BalanceException extends RuntimeException{

    Low_BalanceException(){ // constructor

        super("Insufficient Balance"); // passing a string to superclass
    }
}

class User_DefinedException{

    public void method(int p) { // method = atm, p = m

        int v1 = p; // let v1 = money

        Scanner object = new Scanner(System.in);
        System.out.print("withdraw amount : ");
        int v2 = object.nextInt();

        if(v1 < v2){ // money < withdraw

            try {
                throw new Low_BalanceException();
            }
            catch (Low_BalanceException e) {

                System.out.println(e);
            }
        }
        else {
            int v3 = v1 - v2;
            System.out.println("remain money : " +v3);
        }
    }
}
