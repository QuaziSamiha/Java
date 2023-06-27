package character;

// Hold a single character value.

public class Character_1 {
    public static void main(String[] args) {

        //declaring reference to object, reference variable (stores at heap)
        //Character is a wrapper class
        Character reference_variable;
        reference_variable = new Character('A');
        System.out.println("reference_variable : " +reference_variable);

        Character object = new Character('A');
        //it is an object of character type and it contains only a single value(stores at heap)
        System.out.println("object : " +object);

        char variable = 'A'; //stores at stack memory
        System.out.println("variable : " +variable);

        //difference between Character and char is in memory management
    }
}
