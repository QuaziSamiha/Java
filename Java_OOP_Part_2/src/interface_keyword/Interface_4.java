package interface_keyword;

// If a class is implementing an interface it has to define all the methods given in that interface.
// If a class does not implement all the methods declared in the interface, the class must be declared abstract.

public class Interface_4 {
    public static void main(String[] args) {

        Class_Four object = new Class_Four();

        object.method_2("10th August,2020");
        System.out.println("interface method non-abstract class : " +object.method_1(300,40));
    }
}

interface interface_name_4{
    int method_1(int p1, int p2);
    void method_2(String p);
}

abstract class Class_4 implements interface_name_4{
    // This class has to be abstract since method of interface_name_4 remains undefined
    @Override
    public void method_2(String p) {
        System.out.println("interface method abstract class : " +p);
    }
}

class Class_Four extends Class_4{
    @Override
    public int method_1(int p1, int p2) {
        return (p1+p2);
    }
}
