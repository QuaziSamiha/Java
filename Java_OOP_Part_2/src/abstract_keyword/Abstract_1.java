package abstract_keyword;  //abstract class without having abstract method

// A class that is declared with abstract keyword is called abstract class in java.
// Objects of an abstract class cannot be created. but we can create reference variable of abstract class.

public class Abstract_1 {
    public static void main(String[] args) {
//      Class_1_Abstract_1 object_1 = new Class_1_Abstract_1(); will show an error
        Class_2_Abstract_1 object = new Class_2_Abstract_1(); // creating object of subclass

        object.method(); // calling non-abstract method of abstract class through object of derived class
    }
}

// abstract class can have abstract and non-abstract methods.
// A class can be abstract without having abstract method.

abstract class Class_1_Abstract_1{ // superclass

    void method(){ // this method has to be defined in this class, otherwise it will show an error

        System.out.println("non_abstract_method in abstract class\n");
    }
}

class Class_2_Abstract_1 extends Class_1_Abstract_1{ // subclass

    //object of this class will call method of its abstract superclass
}

// We cannot declare abstract constructors and abstract static method.