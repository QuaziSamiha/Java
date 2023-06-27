package variable_static;

public class Static_Variable_8 {

    static int v = 0; // static variable so not related to object

    Static_Variable_8(){
        v++;
    }

    void method(){  // instance method
        System.out.println("total object : " +v);
    }
}
