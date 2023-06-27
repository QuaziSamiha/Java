package jump_statement;

// labeled continue statement : it skips outer loop as well inner when if condition meet

public class Continue_Statement_2 {

    public static void main(String[] args) {

        Label_Name : // label
        for(int i = 1; i <= 7; i++) {

            System.out.println("i : " +i);

            for(int j = 1; j <= 4; j++) {

                if(i == 3) {
                    System.out.println("Skipped Inner and Outer Loop \n");
                    continue Label_Name;
                }
                System.out.println("Labeled Continue Statement (j) -> " +j);
            }
            System.out.print("\n");
        }
    }
}


