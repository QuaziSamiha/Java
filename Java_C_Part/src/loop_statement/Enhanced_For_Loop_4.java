package loop_statement;  // enhanced for loop using break statement

public class Enhanced_For_Loop_4 {

    public static void main(String[] args) {

        int array[] = {10, 20, 30, 40, 50};

        int sum = 0;
        for (int i : array) {  // note that i is not initialized

            if(i == 30) {  //  i indicates array elements directly
                break;
            }

            sum = sum + i; //  i indicates array elements directly so we can add them

            System.out.println(i);  // printing i which indicates array elements directly
            /* It displays values there is nothing like index number.It automatically counts the element. */
        }
        System.out.println("\n total : " +sum);
    }
}

