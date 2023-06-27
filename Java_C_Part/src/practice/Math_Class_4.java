package practice;

public class Math_Class_4 {
    public static void main(String[] args) {

        System.out.println("absolute value   : " +(Math.abs(-23.3232)));
        System.out.println("square root      : " +Math.sqrt(25.0));
        System.out.println("power            : " +Math.pow(2,5));
        System.out.println("value of pi      : " +Math.PI);
        System.out.println("log of 1         : " +Math.log(1.0));
        System.out.println("exponential of 1 : " +Math.exp(1));
        System.out.println("maximum          : " +Math.max(23,98));
        System.out.println("minimum          : " +Math.min(-22.22f, 100.22f));
        System.out.println("ceil value       : " +Math.ceil(-5.1));
        System.out.println("floor value      : " +Math.floor(-5.6));
        System.out.println("ceil value       : " +Math.ceil(5.1));
        System.out.println("floor value      : " +Math.floor(5.6));

        // all methods of math class are static...so we can use them using class name and dot operator
    }
}
