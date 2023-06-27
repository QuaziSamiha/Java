package super_keyword;  // super keyword with instance method

// single inheritance

/*
1.super is used to refer immediate parent class instance variable.
2.super is used to invoke immediate parent class method.
3.super() is used to invoke immediate parent class constructor.
    Default constructor :  super()
    Parameterized constructor : super(parameter list)
*/

public class Super_Keyword_2 {
    public static void main(String[] args) {
        Class_2_Super_keyword_2 object = new Class_2_Super_keyword_2();
        object.method();
    }
}


class Class_1_Super_keyword_2 { //superclass
    int instance_variable; //instance variable
}

class Class_2_Super_keyword_2 extends Class_1_Super_keyword_2 { //subclass

    int instance_variable;

    void method() { // instance method

        instance_variable = 5;
        super.instance_variable = 50; // using super keyword to access instance variable of super class and initialize it

        System.out.println("instance_variable_2 : " +super.instance_variable);
        System.out.println("instance_variable_2 : " +instance_variable);
    }
}