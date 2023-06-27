package constructor;  // why we use constructor

public class Constructor_1 {
    public static void main(String[] args) {
        Class_1 object_1 = new Class_1(3456, "java", 23.342f, 'f'); // constructor can initialize object
        // object_1.instance_method_1(); we don't need to call this method
        object_1.instance_method_2();
        Class_1 object_2 = new Class_1(34, "Java Programming", 100.343f, 'M');
        // object_2.instance_method_1();
        object_2.instance_method_2();
    }
}

class Class_1{
    int variable_1;
    String variable_2;
    float variable_3;
    char variable_4;

    Class_1(int p1, String p2, float p3, char p4){  // parameterized constructor
        variable_1 = p1;
        variable_2 = p2;
        variable_3 = p3;
        variable_4 = p4;
    }
    /*
     void instance_method_1(int p1, String p2, float p3, char p4){
        variable_1 = p1;
        variable_2 = p2;
        variable_3 = p3;
        variable_4 = p4;
    }
    */
    void instance_method_2(){
        System.out.println("integer   : " +variable_1);
        System.out.println("string    : " +variable_2);
        System.out.println("float     : " +variable_3);
        System.out.println("character : " +variable_4);
        System.out.println("\n");
    }
    // we can also make a method to take input
}

// constructors initialize objects
// we don't need to call constructor where we have to call method
// constructor is a special type of method that is used to initialize the object
/*
properties of the constructor :
constructor has the same name as that of the class it belongs.
constructor is a special type of method
constructor has no return type not even void
it is called automatically
 */