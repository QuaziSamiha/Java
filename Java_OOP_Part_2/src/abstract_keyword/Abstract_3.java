package abstract_keyword;

/*
If you are extending any abstract class that have abstract method, you must either provide the
implementation of the method or make this class abstract.
Objects of an abstract class cannot be created. but we can create reference variable of abstract class.
*/

public class Abstract_3 {
    public static void main(String[] args) {
        Class_3_Abstract_3 object = new Class_3_Abstract_3();
//      Class_2_Abstract_3 object = new Class_2_Abstract_3(); creating object so showing error

        object.abstract_method();
        object.method();

        Class_1_Abstract_3 reference_variable; // creating reference variable
        reference_variable = new Class_3_Abstract_3();
        // reference variable of class Class_2_Abstract_3 refers the object of class Class_3_Abstract_3
        reference_variable.abstract_method();
    }
}

// fully abstract class(100%)
abstract class Class_1_Abstract_3{ // abstract superclass
    abstract void abstract_method();
}

abstract class Class_2_Abstract_3 extends Class_1_Abstract_3{ // abstract subclass
    void method(){
        System.out.println("non-abstract method in subclass");
    }
}

class Class_3_Abstract_3 extends Class_2_Abstract_3{ // subclass
    void abstract_method(){
        System.out.println("defining abstract method in subclass");
    }
}