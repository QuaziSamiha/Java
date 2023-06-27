package basic_knowledge;

public class Random_Number_4 {

    public static void main(String[] args) {

        int variable = (int)((Math.random()*10) + 1);

        for (int i = 0; i < 10; i++) {
            System.out.println(variable);
        }
    }
}
