package package_two; // accessing package using fully-qualified-name

public class Package_1_One {
    public static void main(String[] args) {

        // creating object of a class which belongs to another package (package one)

        package_one.Package_1 object = new package_one.Package_1();  // fully-qualified-name

        object.method_one_1(); // calling method of another package
    }
}

// package_one and package_two are related