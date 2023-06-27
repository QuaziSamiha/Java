package package_one; // accessing packages import the package class

public class Package_2 {

    /*
    All files in the package must be named class_name.java where class_name is the name of
    the single public class in the file.
    */

    // this method will be called from main method of another class (Package_2) of another package (package_two)

    public void method_one_2(){
        System.out.println("Package name : package_one");
        System.out.println("Class name   : Package_2");
        System.out.println("Method name  : method_one_2");
    }
}

// package_one and package_two are related

// Advantage of package : make easy reuse-ability

/*
Accessing Packages :
             a.Fully Qualified Name :
java.util.Scanner
example : java.util.Scanner obj = new java.util.Scanner();
package package_name, class_name
example : class_name obj = new class_name();
             b.Import The Package Class :
Import a specific class into the current file.Import statement should be put at the beginning
of the file before defining any class or interface definition.
java.util.Scanner
import java.util.Scanner
example : Scanner obj = new Scanner();
package package_name, class_name
import package_name.class_name
example : class_name obj = new class_name();
             c.Import An Entire Package
To import all the classes and interfaces contained in a particular package, use the
import statement with the asterisk(*).
import java.util.*
example : Scanner obj = new Scanner();
import package_name.*
example : class_name obj = new class_name();
*/