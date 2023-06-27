package exception_handling; // (1:41pm,11 January,2020 & 11:10am,13 August,2020)

public class ExceptionHandling_13 {
    public static void main(String[] args) {

        try { // this block can create three types exception

            int v1 = 100/5;
            System.out.println("v1 : " +v1);

            int array[] = new int[5];
            array[3] = 100;
            System.out.println("array[3] : " +array[3]);

            String v2 = "Java";
            System.out.println(v2.length());
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {

            // if handling code is same,then we can reduce code length in this way(feature of java 1.7)
            System.out.println("\nNot Possible"); // handling code
        }

        catch (NullPointerException e) {

            System.out.println("\ninvalid");
        }

        System.out.println("\nAfter all catch block");
    }
}

/*
        This block will create an error since parent child not allowed in multi catch in java 1.7
        catch (ArithmeticException | ArrayIndexOutOfBoundsException | Exception e)
        {
            System.out.println("Not Possible");
        }
*/