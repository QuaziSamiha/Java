package method_static;  // class Static_Method_7 and class Static_Method_6 is related

public class Static_Method_6 {

    void instance_method(){
        System.out.println("non-static method");
    }
    static void static_method(){
        Static_Method_6 object = new Static_Method_6();
        object.instance_method();
        System.out.println("static method");
    }
}
