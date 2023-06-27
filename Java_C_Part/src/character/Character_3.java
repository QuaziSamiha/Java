package character;

import java.util.Scanner;

public class Character_3 {
    public static void main(String[] args) {

        char variable;

        Scanner object = new Scanner(System.in);

        System.out.print("Enter a character or string : ");
        variable = object.next().charAt(0);
        System.out.println("Entered : " +variable);

        System.out.print("Enter a character or string : ");
        variable = object.next().charAt(3);
        System.out.println("Entered : " +variable);

    }
}

/*
input and output :

Enter a character or string : java
Entered : j
Enter a character or string : program
Entered : g

Process finished with exit code 0

*/