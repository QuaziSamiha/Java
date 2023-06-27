package array;  // non-primitive data type

public class Array_1 {

    public static void main(String[] args) {

        int array_1[]; // declaring memory
        array_1 = new int[6]; // allocating memory

        int array_2[] = new int[4]; // declaring & allocating memory together

        int[] array_3; // declaring memory
        array_3 = new int[8]; // allocating memory

        int[] array_4 = new int[4]; // declaring & allocating memory

        // initialization of array
        array_2[0] = 12;
        array_2[1] = 14;
        array_2[2] = 20;
        array_2[3] = 24;

        int array_5[] = {11,22,33,44}; // declaration,allocation & initialization together
        // in this case there is no need to use new operator

        System.out.println("array_2[1] : " +array_2[1]);
        System.out.println("array_5[2] : " +array_5[2]);
    }
}

/*
Array provide a mechanism for declaring & accessing several data items with
only one identifier,thereby simplifying the task of data management.
Single subscript/indexed variable is referred to a one dimensional or linear array.
*/

