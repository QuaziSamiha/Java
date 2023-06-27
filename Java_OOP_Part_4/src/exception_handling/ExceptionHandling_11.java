package exception_handling;  // (1:43pm,11 January,2020 & 10:28am,13 August,2020)

public class ExceptionHandling_11 {
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
        catch (Exception e) {  // but it is not a good practice. it is better to use proper exception type

            System.out.println("\nNot Possible"); // handling code
        }

        System.out.println("\nAfter catch");
    }
}

/*
Exception is a class(superclass),
Runtime Exception is a subclass of Exception class and ArithmeticException is a subclass of Runtime Exception.
*/

/*

public class ExceptionHandling_11
{
    public static void main(String[] args)
    {
        try{
            int v1 = 100 / 0; //exception will be created
            System.out.println("number_1 : " + number_1);

            int array[] = new int[5];
            array[4] = 8;
            System.out.println("array[4] : " + array[4]);

            String v2 = "Java";
            System.out.println(v2.length());
        }
        catch (Exception e){
            System.out.println("Not Possible");
        }
    }
}

output : Not Possible

*/

/*

public class ExceptionHandling_11
{
    public static void main(String[] args)
    {
        try{
            int v1 = 100 / 2;
            System.out.println("v1 : " +v1);

            int array[] = new int[5];
            array[8] = 8; //exception will be created
            System.out.println("array[8] : " + array[8]);

            String v2 = "Java";
            System.out.println(v2.length());
        }
        catch (Exception e){
            System.out.println("Not Possible");
        }
    }
}

output :
v1 : 50
Not Possible

*/

/*

public class ExceptionHandling_11
{
    public static void main(String[] args)
    {
        try{
            int v1 = 100 / 2;
            System.out.println("number_1 : " + number_1);

            int array[] = new int[5];
            array[4] = 8;
            System.out.println("array[4] : " + array[4]);

            String v2 = null; //exception will be created
            System.out.println(v2.length());
        }
        catch (Exception e) {
            System.out.println("Not Possible");
        }
    }
}

output :
v1 : 50
array[4] : 8
Not Possible

*/