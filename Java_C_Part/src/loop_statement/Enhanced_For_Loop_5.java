package loop_statement;   // enhanced for loop in 2D array

public class Enhanced_For_Loop_5 {

    public static void main(String[] args) {

        int array[][] = {{11,22,21},{33,44,41},{55,66,61}};

        for(int i[] : array){ // for row

            for(int j : i) {  // for column

                System.out.print(j+ " ");

            }
            System.out.println();
        }
    }
}
