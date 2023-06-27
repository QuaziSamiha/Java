package abstract_keyword;

/*
If you are extending any abstract class that have abstract method, you must either provide the
implementation of the method or make this class abstract.
*/

public class Abstract_4 {
    public static void main(String[] args) {
        Class_3_Abstract_4 object = new Class_3_Abstract_4();
//      Class_2_Abstract_4 object = new Class_2_Abstract_4(); showing error

        object.abstract_method_1();
        object.method();
        object.abstract_method_2();
    }
}

abstract class Class_1_Abstract_4{ // abstract superclass
    abstract void abstract_method_1();
    abstract void abstract_method_2();
}

abstract class Class_2_Abstract_4 extends Class_1_Abstract_4{ // abstract subclass

    void abstract_method_1(){
        System.out.println("defining abstract method 1 in subclass");
    }
    void method(){
        System.out.println("non-abstract method in subclass");
    }
}

class Class_3_Abstract_4 extends Class_2_Abstract_4{ // subclass
    void abstract_method_2(){
        System.out.println("defining abstract method 2 in subclass");
    }
}
