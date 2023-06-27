package interface_keyword; // one class implements one interface

// An interface is like a class with nothing but abstract methods and final fields.

public class Interface_2 {
    public static void main(String[] args) {
        Class_2 object = new Class_2(); // We cannot create object of an interface.

        object.abstract_method_1();
        System.out.println(object.abstract_method_2(12,30));
    }
}

// All methods of an interface is abstract.
// All methods and fields of an interface are automatically (by default) public.

interface Interface_One_2{

    // by default it is abstract, public method and it cannot be defined here
    void abstract_method_1();
    int abstract_method_2(int p1, int p2);
}

class Class_2 implements Interface_One_2{  // An interface cannot extends classes.

    // use of public keyword is mandatory
    @Override
    public void abstract_method_1() {
        System.out.println("abstract_method_1 of interface is defined");
    }
    @Override
    public int abstract_method_2(int p1, int p2) {
        return p1+p2;
    }
}