package package_two;

import package_one.* ; // importing all the classes of another package (package_one)

public class Package_3_Three {
    public static void main(String[] args) {

        Package_2 object_1 = new Package_2();
        object_1.method_one_2();

        System.out.print("\n");

        Package_1 object_2 = new Package_1();
        object_2.method_one_1();
    }
}


// package_one and package_two are related