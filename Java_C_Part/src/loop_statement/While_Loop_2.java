package loop_statement;  // iteration statement

public class While_Loop_2 {

    public static void main(String[] args) {

        int variable = 10; // initialization
        while(true) // condition true means it will run infinite time
        {
            if(variable == 0) // condition for exiting from loop
            {
                break; // exit statement
            }

            System.out.println("Java Program -> " +variable);
            variable--; // incrementing
        }

        System.out.println("\nOut of loop");
    }
}
