/*
The very first statement in each file in the package, before any import statements or
anything put the statement package package_name.
Package name should be unique.
*/
package package_one;  // accessing package using fully-qualified-name

//A package is a collection of related classes and interfaces providing access protection and namespace management.

public class Package_1 { // There must be not more than one public class per file.

    // this method will be called from main method of another class (Package_1) of another package (package_two)

    public void method_one_1(){
        System.out.println("Package name : package_one");
        System.out.println("Class name   : Package_1");
        System.out.println("Method name  : method_one_1");
    }
}

// package_one and package_two are related

/*
Types of package : 2
    Built-in Package
    example : java.util.Scanner
    User-defined Package
    example : package package_name

Directory name must exactly match the package name.
*/
