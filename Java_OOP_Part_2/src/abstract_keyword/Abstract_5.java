package abstract_keyword;

public class Abstract_5 {
    public static void main(String[] args) {
        Class_2_Abstract_5 object_1 = new Class_2_Abstract_5();
        Class_3_Abstract_5 object_2 = new Class_3_Abstract_5();

        object_1.abstract_method();
        object_2.abstract_method();
    }
}

abstract class Class_1_Abstract_5{ // abstract superclass
    abstract void abstract_method();
}

class Class_2_Abstract_5 extends Class_1_Abstract_5{ // subclass
    void abstract_method(){
        System.out.println("abstract method in subclass 1");
    }
}

class Class_3_Abstract_5 extends Class_1_Abstract_5{ // subclass
    void abstract_method(){
        System.out.println("abstract method in subclass 2");
    }
}
