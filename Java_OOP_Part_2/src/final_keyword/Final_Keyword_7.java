package final_keyword;  // final keyword with method

/*
1.We cannot override final method in subclass.
2.We define a method final when we concerned that a subclass may accidentally redefine the
method(override).
*/

public class Final_Keyword_7 {
    public static void main(String[] args) {

        Final_Method_2 object = new Final_Method_2();

        object.method_1();
        object.method_2();
    }
}

class Final_Method_1{

    int v1 = 340;

    final void method_1(){
        System.out.println("superclass final method\n");
    }

    void method_2(){ // it is called overriden method
        System.out.println("superclass non-final method");
    }
}

class Final_Method_2 extends Final_Method_1{

    // method_1() is also so we call it, but we cannot override it
    int v2 = 60;

    void method_2(){  // it is called override method

        super.method_2();  // super.method_1(); we can call final method using super keyword
        int v = v1 + v2;
        System.out.println("method overriding : " +v);
    }

//  void method_1(){
//      System.out.println("method overriding is not possible for final method");
//  }
}