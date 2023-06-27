package loop_statement; // iteration statement

public class While_VS_Do_While_1 {

    public static void main(String[] args) {

        int v1 = 6;
        while(v1 <= 5){
            System.out.println("while loop");
            v1++;
        }

        int v2 = 6;
        do{
            System.out.println("do-while loop");
            v2++;
        }while (v2 <= 5);
    }
}
