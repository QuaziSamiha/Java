package character; // use of isLetter() method

public class Character_4 {
    public static void main(String[] args) {

        char v1 = 'K';
        char v2 = '8';
        System.out.println(Character.isLetter(v1));
        System.out.println(Character.isLetter(v2));
        System.out.println(Character.isLetter('\n'));
        System.out.println(Character.isLetter('0'));
        System.out.println(Character.isLetter('\t'));
        System.out.println(Character.isLetter('b'));
        System.out.println(Character.isLetter(','));

        System.out.println("\n");

        System.out.println(Character.isWhitespace(v1));
        System.out.println(Character.isWhitespace(v2));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('0'));
        System.out.println(Character.isWhitespace('\t'));
        System.out.println(Character.isWhitespace('b'));
        System.out.println(Character.isWhitespace(' '));

        System.out.println("\n");

        System.out.println(Character.toString(v1));
        System.out.println(Character.toString(v2));
        System.out.println(Character.toString('K'));

        System.out.println("\n");

        System.out.println(Character.isUpperCase(v1));
        System.out.println(Character.isUpperCase(v2));
        System.out.println(Character.isUpperCase('A'));

    }
}
