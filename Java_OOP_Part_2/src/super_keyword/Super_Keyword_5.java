package super_keyword; // Super with Parameterized Constructor

/*
1.Use super(parameter-list) in subclass to initialize superclass parameterized constructor
2.Not optional
3.super(parameter-list) should be first statement
4.Parameter-list in super should be same as superclass parameterized constructor
*/

public class Super_Keyword_5 {
    public static void main(String[] args) {
        Class_2_Super_Keyword_5  object = new Class_2_Super_Keyword_5 ();
    }
}

class Class_1_Super_Keyword_5 { //superclass

    // constructor is not a member of a class, so it cannot be inherited
    Class_1_Super_Keyword_5(int parameter ) {  //parameterized constructor

        int local_variable = parameter;
        System.out.println("Superclass Parameterized Constructor : " +local_variable);
    }
}
// constructor cannot be inherited but it can be invoked in subclass

class Class_2_Super_Keyword_5  extends Class_1_Super_Keyword_5 {  //subclass

    Class_2_Super_Keyword_5 () { //default constructor

        super(500); // without this line the program will show an error (has to be first statement)
        int local_variable = 200;
        System.out.println("Subclass Default Constructor : " +local_variable);
    }
}

