package jump_statement;

// labeled break statement : it breaks outer loop as well inner when if condition meet

public class Break_Statement_2 {

    public static void main(String[] args) {

        Label_Name :
        for(int i = 1; i <= 7; i++) {

            System.out.println("i : " +i);

            for(int j = 1; j <= 4; j++) {

                if(i == 3) {
                    System.out.println("\nExit Program from Outer and Inner Loop\n");
                    break Label_Name;
                }
                System.out.println("Labeled_Break_Statement (j) -> " +j);
            }
            System.out.println();
        }
    }
}


