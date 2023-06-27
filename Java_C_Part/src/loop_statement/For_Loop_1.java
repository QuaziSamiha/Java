package loop_statement; // the for loop is frequently used, usually where the loop will be traversed a fixed number of times.

public class For_Loop_1 {

    public static void main(String[] args) {

        int variable;
        for(variable = 5; variable <= 10; variable++) // initialization; condition; increment
        {
            System.out.println("Java Programming  -> " +variable); // block statement
        }

        System.out.println(); // new line

        for(int variable_1 = 10; variable_1 > 0; variable_1--) // initialization; condition; decrement
        {
            System.out.print(variable_1+ "\t"); // block statement
        }
    }
}
