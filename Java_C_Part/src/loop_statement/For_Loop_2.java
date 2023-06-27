package loop_statement;  // iteration statement

// nested for loop

//the statement block of a for loop lies completely inside the block of another loop.

public class For_Loop_2 {

    public static void main(String[] args) {

        for(int variable_1 = 1; variable_1 <= 10; variable_1 = 2 + variable_1) // outer for loop
        {
            for(int variable_2 = 1; variable_2 <= 10; variable_2++) // inner for loop
            {
                System.out.print(" " +variable_1+ " ");
            }
            System.out.println();
        }
    }
}
