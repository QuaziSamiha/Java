package exception_handling;  // multiple catch block (11:39am,11 January,2020 & 9:33am,13 August,2020)

public class ExceptionHandling_9 {
    public static void main(String[] args) {

        try {

            int v1 = 100/5; // no exception will be created
            System.out.println("v1 : " +v1);

            int array[] = new int[5];
            array[8] = 100; // exception will be created
            System.out.println("array[8] : " +array[8]);

            String v2 = null; // exception will be created
            System.out.println(v2.length());
        }
        catch (ArithmeticException e) {
            System.out.println("\nNot Possible 1"); // handling code
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nNot Possible 2"); // handling code
        }

        catch (NullPointerException e) {
            System.out.println("\nDon't input null"); // handling code
        }

        System.out.println("\nAfter all catch");
    }
}
