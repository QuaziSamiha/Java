package loop_statement;  // iteration statement

public class Do_While_Loop_1 {

    public static void main(String[] args) {

        int variable = 1; // initializing
        do {

            System.out.println("Java Programming -> " +variable);

            variable++; //incrementing

        }while (variable <= 10); // condition
    }
}
/*
the do while loop is similar to while loop, but the condition is checked after the loop body is executed.
this ensure that the loop body is run at least once.
*/

