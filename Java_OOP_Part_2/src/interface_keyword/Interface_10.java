package interface_keyword;

public class Interface_10 {
    public static void main(String[] args) {

        ClassTen object = new ClassTen();

        object.method();
    }
}

interface Interface_One_10{
    int v = 800;
    void method();
}

interface Interface_Two_10{
    int v = 300;
    void method();
}

class ClassTen implements Interface_One_10,Interface_Two_10{  // multiple inheritance

    int variable = Interface_One_6.v + Interface_Two_6.v;

    @Override
    public void method() {
        System.out.println("Interface_10 method");
    }

}
