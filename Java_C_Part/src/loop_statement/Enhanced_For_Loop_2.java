package loop_statement;  // enhanced for loop in one D array

public class Enhanced_For_Loop_2 {

    public static void main(String[] args) {

        int array[] = {10, 20, 30, 40, 50};

        int sum = 0;
        for (int i : array) { // note that i is not initialized

            sum = sum + i;  //  i indicates array elements directly so we can add them

            System.out.println(i); // printing i which indicates array elements directly
            /* It displays values there is nothing like index number.It automatically counts the element. */
        }
        System.out.println("\n total : " +sum);
    }
}

/*
Enhanced for loop is useful when scanning the array.

Syntax:
for(data-type variable : array_name);

It is used to scan all elements of an array.
We cannot use enhanced for loop for specific number of element.
If we need specific number of element then we have to use the standard for loop.
We can perform addition subtraction etc with elements using enhanced for loop.
break and continue statement can control the behaviour of enhanced for loop.
It is also known as "for each loop"
*/
