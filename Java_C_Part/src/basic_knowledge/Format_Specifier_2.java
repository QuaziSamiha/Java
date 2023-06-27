package basic_knowledge; // using format() method of DecimalFormat class

import java.text.DecimalFormat;

public class Format_Specifier_2 {
    public static void main(String[] args) {

        double v = 1.3274678738;


        DecimalFormat object_1 = new DecimalFormat("0.00");

        System.out.println("v : " +object_1.format(v));
//------------------------------------------------------------------------------------------------

        DecimalFormat object_2 = new DecimalFormat("0.0000");

        System.out.println("v : " +object_2.format(v));
    }
}
