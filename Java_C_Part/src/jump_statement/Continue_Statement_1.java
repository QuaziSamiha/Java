package jump_statement;

// Unlabeled continue statement : It skips inner loop when the if condition meet.It doesn't skip outer loop.

public class Continue_Statement_1 {

    public static void main(String[] args) {

        for(int i = 1; i <= 7; i++) {

            System.out.println("i : " +i);
            for(int j = 1; j <= 4; j++) {

                if(i == 3) {
                    System.out.println("Skipped Inner Loop ( i ) -> " +i);
                    continue;
                }
                System.out.println("Unlabeled Continue Statement ( j ) -> " +j);
            }
            System.out.print('\n');
        }
    }
}


