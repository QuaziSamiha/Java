package practice;  // using logical OR operator

import java.util.Scanner;

public class Identify_Vowel_Or_Consonant {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        char variable;
        System.out.print("Enter a character : ");
        variable = object.next().charAt(0);  // if any string is entered,then 0 index character will be considered as a character input

        if(variable == 'a' || variable == 'e' || variable == 'i' || variable == 'o' || variable == 'u'){
            System.out.println("vowel");
        }
        else {
            System.out.println("consonant");
        }

    }
}
