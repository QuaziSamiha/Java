package abstract_keyword; //abstract class without and with having abstract method

public class Abstract_2 {
    public static void main(String[] args) {
        Class_2_Abstract_2 object = new Class_2_Abstract_2();

        object.abstract_method();
        object.method();
    }
}

// abstract class can have abstract and non-abstract methods.
// It is not necessary to declare all method abstract in a abstract class.
// If there is any abstract method in a class,that class must be abstract.
// A method that is declared with abstract keyword and does not have implementation is known as abstract method.

// not fully abstract class(not 100%) since it has non-abstract method
abstract class Class_1_Abstract_2{  // superclass

    abstract void abstract_method(); // its must be overridden

    void method(){
        System.out.println("non-abstract method in abstract class");
    }
}

// The abstract methods of an abstract class must be defined in its subclass.

class Class_2_Abstract_2 extends Class_1_Abstract_2{ // subclass

    void abstract_method(){
        System.out.println("defining abstract method of abstract class in its subclass");
    }
}
