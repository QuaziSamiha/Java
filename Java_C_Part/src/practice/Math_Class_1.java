package practice; // Math is a built-in class in java

public class Math_Class_1 {

    public static void main(String[] args) {

        int v1 = 20;
        int v2 = 45;

        System.out.println("maximum number : " +(Math.max(v1,v2))); // using max() method of Math class

        int v3 = Math.min(v1,v2);  // using min() method of Math class
        System.out.println("minimum number : " + v3);
    }
}
