package jump_statement;

public class Break_Statement_1 {

    public static void main(String[] args) {

        for(int variable = 1; variable <= 10; variable++) {

            if(variable == 5) {
                break; // break means exit
            }
            System.out.print(variable+ "  ");
        }
    }
}
