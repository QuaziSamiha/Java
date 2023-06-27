package super_keyword;   //use of super keyword with instance variable

// single inheritance

/*
1.super is used to refer immediate parent class instance variable's.
2.super is used to invoke immediate parent class method.
3.super() is used to invoke immediate parent class constructor.
    Default constructor :  super()
    Parameterized constructor : super(parameter list)
*/

public class Super_Keyword_1 {
    public static void main(String[] args) {
        Class_2_Super_keyword_1 object = new Class_2_Super_keyword_1();
        object.method();
    }
}

class Class_1_Super_keyword_1 { //superclass

    //instance variables
    int instance_variable = 300; // this variable is inherited but hide in the subclass
    int instance_variable_1 = 100;
}

class Class_2_Super_keyword_1 extends Class_1_Super_keyword_1 { //subclass

    //instance variables
//  int instance_variable = 300; is also here
    int instance_variable = 500;  // a subclass can hide instance variable of superclass
    int instance_variable_1 = 200;

    void method() { // instance method

        System.out.println("instance_variable   : " + instance_variable);

        System.out.println("instance_variable_1 : " + super.instance_variable_1);
        System.out.println("instance_variable_1 : " + instance_variable_1);
    }
}