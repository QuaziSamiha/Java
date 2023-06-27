package exception_handling;  // (1:22pm,11 January,2020 & 10:54am,13 August,2020)

// all catch block must be ordered from most specific to most general

public class ExceptionHandling_12 {
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
        catch (ArithmeticException e) {  // here pointing particular exception (most specific, get more priority)

            System.out.println("\nNot Possible 1");
        }

        catch (ArrayIndexOutOfBoundsException e) { //get more priority,since here pointing particular exception

            System.out.println("\nNot Possible 2");
        }

        catch (Exception e) { // most general

            // this block cannot be written before most specific block,as it is most general. otherwise will show an error
            System.out.println("\nException occur");
        }

        System.out.println("\nAfter all catch");
    }
}
