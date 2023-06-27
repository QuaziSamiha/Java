package jump_statement;

// Unlabeled break statement : It breaks inner loop when the if condition meet.It doesn't break outer loop.

public class Break_Statement_3 {

    public static void main(String[] args) {

        for(int i = 1; i <= 7; i++) {

            System.out.println("i : " +i);

            for(int j = 1; j <= 4; j++) {

                if(i == 3) {
                    System.out.println("Exit Program from Inner Loop\n");
                    break;
                }

                System.out.println("Unlabeled Break Statement (j) -> " +j);
            }
            System.out.println();
        }
    }
}


