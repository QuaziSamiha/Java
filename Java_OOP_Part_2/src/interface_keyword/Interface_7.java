package interface_keyword;

// An interface can inherit another interface using extends keywords.
// An interface can extend(inherit) an interface.

public class Interface_7 {
    public static void main(String[] args) {

        ClassSeven object = new ClassSeven();

        object.method_1();
        object.method_2("1:25pm, 10th August,2020");
    }
}

interface Interface_One_7{
  void method_1();
}

interface Interface_Two_7 extends Interface_One_7 {
   void method_2(String parameter);
}


class ClassSeven implements Interface_Two_7{

    @Override
    public void method_1() {
        System.out.println("method_1");
    }

    @Override
    public void method_2(String parameter) {
        System.out.println(parameter);
    }
}