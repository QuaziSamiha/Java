package practice; // finding area of triangle & circle

import java.util.Scanner;

public class Finding_Area_Of_Triangle_And_Circle {

    public static void main(String[] args) {

        Scanner object = new Scanner(System.in);

        double base, height, area_1, radius, area_2;

        System.out.print("Enter base of the triangle : ");
        base = object.nextDouble();
        System.out.print("Enter height of the triangle : ");
        height = object.nextDouble();
        area_1 = 0.5 * base * height;
        System.out.println("area of the triangle : " +area_1);

        System.out.print("Enter radius of the circle : ");
        radius = object.nextDouble();
        area_2 = 3.1416 * radius * radius;
        System.out.println("area of the circle : " +area_2);
    }
}
