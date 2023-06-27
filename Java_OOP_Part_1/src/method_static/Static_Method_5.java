package method_static;

// Static method can access static data member or static variable and can change the value of it.

public class Static_Method_5 {

    int instance_variable = 14;
    static int static_variable = 40; // static variables have to declare in a class not a method,constructor or block.

    public static void main(String[] args) {  // main method which is static
        int local_variable = 25;
        // static method can access local variable & static variable directly
        System.out.println("local_variable : " +local_variable);
        System.out.println("static_variable : " +static_variable);
        // System.out.println("instance_variable : " +instance_variable); since non static data member so it will show an error
    }
}
// It can not use non static data member or non static variable.


