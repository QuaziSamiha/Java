package array;  // array using enhanced for loop

public class Array_14 {

    public static void main(String[] args) {

        String[] array_name = {"C Programming", "C++ Programming", "Java Programming", "Python Programming",};

        for (String i : array_name) { // enhanced for loop
            System.out.println(i);
        }

        for (int i = 0; i < array_name.length; i++) {  // usual for loop
            System.out.println(array_name[i]);
        }
    }
}
