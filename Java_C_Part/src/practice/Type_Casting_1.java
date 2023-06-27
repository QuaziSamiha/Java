package practice;

public class Type_Casting_1 {
    public static void main(String[] args) {

        int v1 = 10;
        double v2 = v1; // implicit type casting

        System.out.println(v2);
//------------------------------------------------------------------------
        double v3 = 10.5;
        int v4 = (int) v3; // explicit type casting

        System.out.println(v4);
    }
}
