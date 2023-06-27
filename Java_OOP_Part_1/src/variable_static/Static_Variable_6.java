package variable_static;  // Static_Variable_6, Static_Variable_7, Static_Variable_8 together

public class Static_Variable_6 {

    int v = 0; // instance and non-static variable  so related to object

    Static_Variable_6(){
        v++;
    }

    void method(){  // instance method
        System.out.println("total object : " +v);
    }
}
