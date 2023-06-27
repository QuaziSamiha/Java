package constructor;  // constructor overloading

public class Constructor_6 {
    public static void main(String[] args) {
        Constructor_Overloading_2 object_1 = new Constructor_Overloading_2("Java", 2020);
        object_1.instance_method();

        Constructor_Overloading_2 object_2 = new Constructor_Overloading_2("Code", "Programming");
    }
}

class Constructor_Overloading_2{  // in terms of types of parameter
    int v1;
    String v2, v3;
    Constructor_Overloading_2(String p1, String p2){
        v2 = p1;
        v3 = p2;
        System.out.println("v2 : " +v2+ "\nv3 : " +v3);
    }
    Constructor_Overloading_2(String p1, int p2){
        v2 = p1;
        v1 = p2;
    }
    void instance_method(){
        System.out.println("string : " +v2+ "\ninteger : " +v1);
    }
}