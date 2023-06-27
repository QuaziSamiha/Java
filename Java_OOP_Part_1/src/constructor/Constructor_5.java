package constructor;  // constructor overloading

public class Constructor_5 {
    public static void main(String[] args) {
        Constructor_Overloading_1 object_1 = new Constructor_Overloading_1(23);
        Constructor_Overloading_1 object_2 = new Constructor_Overloading_1(434.54f);
        Constructor_Overloading_1 object_3 = new Constructor_Overloading_1(12,12);
    }
}

class Constructor_Overloading_1{ // in terms of types of parameter and in terms of number of parameter
    // instance variables
    int v1, v2, v3;
    float v4;
    Constructor_Overloading_1(int p){
        v1 = p;
        System.out.println("v1 : " +v1);
    }
    Constructor_Overloading_1(int p1, int p2){
        v2 = p1;
        v3 = p2;
        System.out.println("v2 : " +v2);
        System.out.println("v3 : " +v3);
    }
    Constructor_Overloading_1(float p){
        v4 = p;
        System.out.println("v5 : " +v4);
    }
}