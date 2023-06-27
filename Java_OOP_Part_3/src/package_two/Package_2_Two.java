package package_two;  // accessing packages import the package class

import package_one.Package_2; // importing a specific class of another package

public class Package_2_Two {
    public static void main(String[] args) {

        Package_2 object = new Package_2(); // Package_2 class belongs to package_one package

        object.method_one_2(); // calling method of another class of another package
    }
}

// package_one and package_two are related