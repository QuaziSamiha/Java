package interface_keyword;

public class Interface_3 {
    public static void main(String[] args) {
        Class_3 object = new Class_3();

        object.abstract_method_1("10th August,2020");
        System.out.println("interface method 2 : " +object.abstract_method_2());
        System.out.println(object.instance_variable);

        System.out.println(Interface_One_3.variable);
    }
}

interface Interface_One_3{

    int variable = 200;
    void abstract_method_1(String parameter);
    int abstract_method_2();
}

//A class implements an interface using implements keyword.

class Class_3 implements Interface_One_3{

    @Override
    public void abstract_method_1(String parameter) {
        System.out.println("interface method 1 : " +parameter);
    }

    @Override
    public int abstract_method_2() {
        return (Interface_One_3.variable+300);
    }

    int instance_variable = 400 + Interface_One_3.variable;
}

// Classes that implement an interface can treat the constants as they were inherited.