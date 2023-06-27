package basic_knowledge;

import java.util.Random;

public class Random_Number_1 {

    public static void main(String[] args) {

        Random object = new Random();

        int variable = object.nextInt(10); // random numbers will be create from 0 to 9
        System.out.println(variable);
    }
}
