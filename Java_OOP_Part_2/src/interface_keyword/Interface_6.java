package interface_keyword;

public class Interface_6 {
    public static void main(String[] args) {

        ClassSix_1 ref_v;

        ref_v = new ClassSix_2();
        ref_v.method_1();
        ref_v.method_2();
        System.out.println(ref_v.variable);
    }
}

interface Interface_One_6{
    int v = 800;
    void method_1();
}

interface Interface_Two_6{
    int v = 300;
    void method_2();
}

abstract class ClassSix_1 implements Interface_One_6,Interface_Two_6{

    int variable = Interface_One_6.v + Interface_Two_6.v;

    @Override
    public void method_1() {
        System.out.println("Interface_One_6 method_1");
    }
}

class ClassSix_2 extends ClassSix_1{
    @Override
    public void method_2() {
        System.out.println("Interface_Two_6 method_2");
    }
}