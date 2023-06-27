package variable_local;

public class Local_Variable_1 {  // main class
    public static void main(String[] args) { // main method

        int local_variable = 12; // declaring & initializing local variable
        System.out.println("local_variable : " +local_variable);
    }
}

class Class_Local_Variable_1{ // a class

    int instance_variable; // variable out side of method

    void method(int p1, int p2) {  // a method

        int local_variable = 24; // declaring & initializing local variable
        // p1, p2 are also local variable

        System.out.println("local_variable : " +local_variable);
        System.out.println("local variable : " +(p1*p2));
    }
}

/*
A local variable in Java is a variable that's declared within the body of a
method, constructor or any block.
you can use the variable only within that method, constructor or block.
other methods in the class aren't even aware that the variable exists.
we can directly access or initialize local variable without any object or class name.
*/