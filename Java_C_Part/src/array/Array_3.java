package array;

// initialization an array with an array

public class Array_3 {

    public static void main(String[] args) {

        int array_1[] = {11,22,33,44};
        int array_2[];

        array_2 = array_1;

        for(int i = 0; i < 4; i++)
        {
            System.out.println("array_2[" +i+ "] : " +array_2[i]);
        }
    }
}
