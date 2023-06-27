package practice;

public class Type_Casting_2 {
    public static void main(String[] args) {

        SuperClass object = new SubClass(); // type casting (upcasting)
        object.method();
    }
}


class SuperClass{
    void method(){
        System.out.println("superclass");
    }
}

class SubClass extends SuperClass{
    void method(){
        System.out.println("subclass");
    }
}