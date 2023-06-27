package basic_knowledge;

import java.util.Random;

public class Random_Number_2 {

    public static void main(String[] args) {

        Random object = new Random();

        int variable = object.nextInt(10) + 1; // random numbers will be create from 1 to 10
        System.out.println(variable);

        variable = object.nextInt(10) + 5; // random numbers will be create from 5 to 15
        System.out.println(variable);

        variable = object.nextInt(6) + 5; // random numbers will be create from 5 to 10
        System.out.println(variable);
    }
}
