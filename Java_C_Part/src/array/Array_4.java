package array;

// calculation with array

public class Array_4 {

    public static void main(String[] args) {

        int array[] = new int[5];

        array[0] = 12;
        array[1] = 30;

        array[2] = array[0] + array[1];
        array[3] = array[1] + 20;
        array[4] = array[0];

        for(int i = 0; i < 5; i++) {
            System.out.println("array[" +i+ "] : " +array[i]);
        }
    }
}
