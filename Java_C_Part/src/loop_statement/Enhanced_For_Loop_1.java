package loop_statement;

public class Enhanced_For_Loop_1 {

    public static void main(String[] args) {

        int array[] = {11,22,33,44,55,66};

        for(int i : array) {  // note that i is not initialized

            System.out.println(i); // printing i which indicates array elements directly
            /* It displays values there is nothing like index number.It automatically counts the element. */

        }
    }
}

/*
Enhanced for loop is useful when scanning the array.

Syntax:
for(data-type variable : array_name);

It is used to scan all elements of an array.
We cannot use enhanced for loop for specific number of elements.
If we need specific number of element then we have to use the standard for loop.
We can perform addition subtraction etc with elements using enhanced for loop.
break and continue statement can control the behaviour of enhanced for loop.
It is also known as "for each loop"
*/
