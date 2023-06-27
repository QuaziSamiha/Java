package practice;  // identify vowel or consonant

import java.util.Scanner;

public class Vowel_Or_Consonant {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        char variable;
        System.out.print("Enter a character : ");
        variable = object.next().charAt(0);  // if any string is entered,then 0 index character will be considered

        if(variable == 'a'){
            System.out.println("vowel");
        }
        else if (variable == 'e'){
            System.out.println("vowel");
        }
        else if (variable == 'i'){
            System.out.println("vowel");
        }
        else if (variable == 'o'){
            System.out.println("vowel");
        }
        else if (variable == 'u'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}
