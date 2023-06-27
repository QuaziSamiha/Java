package method_overriding;

public class Method_Overriding_1 {
    public static void main(String[] args) {
        Class_One object_1 = new Class_One();
        Class_Two object_2 = new Class_Two();
        Class_Three object_3 = new Class_Three();

        object_1.method();  // calling method of superclass
        object_2.method();  // calling method of subclass one
        object_3.method();  // calling method of subclass two
    }
}

// hierarchical inheritance

class Class_One { //superclass
    int v1 = 100; // instance variable of this class (of superclass)
    void method() { // instance method of this class (of superclass)
        System.out.println("Super Class ");
        System.out.println("v1    : " +v1);
    }

}
class Class_Two extends Class_One { //subclass
    int v2 = 200;  // instance variable of this class (of subclass)
    void method() { //method overriding (re-defining method of superclass)
        int v = v1+v2; // using of instance variable of super class and this class
        System.out.println("\n\nSubClass One");
        System.out.println("v1    : " +v1+ "\nv2    : " +v2);
        System.out.println("v1+v2 : " +v); // v is a local variable of this method
    }
}

class Class_Three extends Class_One {  // subclass
    int v3 = 30; // instance variable of this class (of subclass)
    void method() { //method overriding (re-defining method of superclass)
        int v = v1*v3; // using of instance variable of super class and this class
        System.out.println("\n\nSubclass two");
        System.out.println("v1    : " +v1+ "\nv3    : " +v3);
        System.out.println("v1*v3 : " +v); // v is a local variable of this method
    }
}
/*
1.Overriding refers to the ability of a subclass to re-implement an instance method inherited from superclass
2.Method overloading can be done in any class but method overriding is possible only in inheritance
3.In method overriding method name and its parameter will be unchanged or same
4.Method overriding is useful since we can re-implement or re-defined method
5.Only inherited methods can be overridden
6.Final and static method can not be overridden
7.The overriding method must have same argument list
8.The overriding method must have the same return type
9.Constructor cannot be overridden since it cannot be inherited
*/
