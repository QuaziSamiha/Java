package loop_statement;  // iteration statement

public class Do_While_Loop_2 {

    public static void main(String[] args) {

        int variable = 0; // initializing
        do {
            System.out.println(variable);
            System.out.println("Loop runs at least once");
        }while (variable != 0); // condition

        System.out.println("End");
    }
}
/*
the do while loop is similar to while loop, but the condition is checked after the loop body is executed.
this ensure that the loop body is run at least once.
*/

