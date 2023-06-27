package interface_keyword;  //  extends And implements together or multiple inheritance

public class Interface_9 {
    public static void main(String[] args) {

        ClassNine_2 object = new ClassNine_2();

        object.method_1("1:35pm, 100th August, 2020");
        System.out.println(object.v);
    }
}

interface Interface_One_9{
    int v = 200;
    void method_1(String p);
}

class ClassNine_1{
    int variable;
    int method_2(int p){
        variable = p;
        return variable;
    }
}

class ClassNine_2 extends ClassNine_1 implements Interface_One_9{
    @Override
    public void method_1(String p) {
        System.out.println(p);
    }

    int v = method_2(1000) + Interface_One_9.v;
}


/*
1.An abstract class can have non-abstract methods, but all methods of an interface are abstract.
2.A class can implement more than two interface, but an abstract class can only subclass one class
3.An abstract class can declare instance variable but interface cannot.
4.An abstract class can have a user defined constructor, but an interface has no constructors.
5.Every method of an interface is automatically public,but an abstract class can have
non-public method.
*/

/*
If no access specifier is given then interface is available only to the members of the
package in which it is declared.
If specifier is public then it ai available to all.
*/