package interface_keyword;

// An interface can extends more than one interfaces.

public class Interface_8 {
    public static void main(String[] args) {
        ClassEight object = new ClassEight();

        object.method_1();
        object.method_2();
        System.out.println(Interface_Three_8.v);
    }
}

interface Interface_One_8{
    void method_1();
}

interface Interface_Two_8{
    void method_2();
}

interface Interface_Three_8 extends Interface_One_8,Interface_Two_8{
    int v = 450;
}

class ClassEight implements Interface_Three_8{
    @Override
    public void method_1() {
        System.out.println("method_1");
    }
    @Override
    public void method_2() {
        System.out.println("method_2");
    }
}