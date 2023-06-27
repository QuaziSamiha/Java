package interface_keyword;  // one class implements more than one interfaces

public class Interface_5 {
    public static void main(String[] args) {

        ClassFive_5 object = new ClassFive_5();

        object.method_1();
        object.method_2();
    }
}

interface Interface_One_5{

    void method_1();
}

interface Interface_Two_5{

    void method_2();
}

// More than one interface can be implemented in a single class.

class ClassFive_5 implements Interface_One_5, Interface_Two_5{
    @Override
    public void method_1() {
        
        System.out.println("Interface_One_5 method_1");
    }
    @Override
    public void method_2() {
        
        System.out.println("Interface_Two_5 method_2");
    }
}