package loop_statement;  // iteration statement

public class While_Loop_1 {

    public static void main(String[] args) {

        int variable = 0; // initialization
        while(variable < 10) // condition within bracket
        {
            System.out.println("variable : " +variable);
            variable++; // incrementing
        }

        System.out.println("End");
    }
}

/*
iterative or loop statement : it means executing the same section of code more than once.
it is used when a section of code may either be executed a fixed number of times, or while
some condition is true.
while, do-while, for loop.

the while loop keeps repeating an action until an associated condition returns false.
*/

