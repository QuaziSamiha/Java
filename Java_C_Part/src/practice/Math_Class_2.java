package practice;  // Math is a built-in class in java

public class Math_Class_2 {

    public static void main(String[] args) {

        int v1 = -34;

        int v2 = Math.abs(v1);  // using abs() method of Math class
        System.out.println("absolute value of v1 : " +v2);

        int v3 = 5;
        int v4 = 2;

        double v6 = Math.pow(v3,v4);  // using pow() method of Math class
        System.out.println(v3+ " to the power " +v4+ " : " +v6);
    }
}
