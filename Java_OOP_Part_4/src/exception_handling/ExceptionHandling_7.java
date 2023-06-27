package exception_handling;  // multiple catch block (11:26am,11 January,2020 & 9:12am,13 August,2020)

public class ExceptionHandling_7 {
    public static void main(String[] args) {

        try {

            int v1 = 100/2; // if v1 = 100/0; then exception will be created
            System.out.println("v1 : " +v1);

            int array[] = new int[5];
            array[4] = 8; // if array[8] = 8; then exception will be created
            System.out.println("array[4] : " +array[4]);

            String v2 = "Java"; // String v2 = null; then exception will be created
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


/*
1.Sometimes there may be chance to have multiple exceptions in a program.We can use multiple catch
block with a single try to handle multiple exception.At a time only one exception is occurred and at
a time only one catch block is executed.
2.All catch block must be ordered from most specific to most general.
3.In multi catch block there should not be any relation between exception types (either parent to
child or child to parent) otherwise we will get compile time error.
*/