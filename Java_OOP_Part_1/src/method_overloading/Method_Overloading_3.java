package method_overloading;  // automatic type conversion in java

public class Method_Overloading_3 {
    public static void main(String[] args) {

        Class_Method_Overloading_3 object = new Class_Method_Overloading_3();

        object.method(12,12); // automatic type conversion
        // the output will be 24.0 instead of 24

        object.method();
    }
}

class Class_Method_Overloading_3{

    void method(double p1, double p2){
        System.out.println(p1+p2);
    }

    void method(){
        System.out.println("method overloading");
    }
}
