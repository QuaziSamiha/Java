package practice; // celsius to Fahrenheit

import java.util.Scanner;

public class Converting_Temperature {

    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        double c, f;

        System.out.print("Enter Celsius temperature : ");
        c = ob.nextDouble();

        f = 1.8 * c + 32;

        System.out.println("Fahrenheit temperature : " +f);
    }
}
