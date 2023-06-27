package basic;

public class Variable_Length_Arguments_1 {
    public static void main(String[] args) {

        Class_1_Variable_Length_Arguments object_1 = new Class_1_Variable_Length_Arguments();
        object_1.method(12,12);
        object_1.method(12,12,12);
        object_1.method(12,12,12,12);

        // here we can pass any number of arguments
        Class_2_Variable_Length_Arguments object_2 = new Class_2_Variable_Length_Arguments();
        object_2.method(12);
        object_2.method(12,10,20,13,40,100);
        object_2.method(10,20,30);
        object_2.method(100,200,400,500);
    }
}

class Class_1_Variable_Length_Arguments{

    void method(int p1, int p2) {
        System.out.println(p1+p2);
    }
    void method(int p1, int p2, int p3) {
        System.out.println(p1+p2+p3);
    }
    void method(int p1, int p2, int p3, int p4) {
        System.out.println(p1+p2+p3+p4);
    }

}

class Class_2_Variable_Length_Arguments{  // using variable length arguments

    void method(int ... parameter) {  // three dot means it can take arguments of any length
        // parameter will work like an array
        int v = 0;
        for (int i : parameter) {  // using enhanced for loop
            v = v + i;
        }
        System.out.println("sum : " +v);
    }
}