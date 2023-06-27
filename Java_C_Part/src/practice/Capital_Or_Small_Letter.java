package practice; // use of logical AND operator

import java.util.Scanner;

public class Capital_Or_Small_Letter {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        char v;
        System.out.print("Enter a character : ");
        v = object.next().charAt(0);  // if any string is entered,then 0 index character will be considered

        if(v >= 'a' && v <= 'z'){
            System.out.println("small letter");
        }
        else if (v >= 'A' && v <= 'Z'){
            System.out.println("capital letter");
        }
        else {
            System.out.println("not a letter");
        }
    }
}
