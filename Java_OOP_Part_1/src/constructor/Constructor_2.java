package constructor;  // use of default constructor

public class Constructor_2 {
    public static void main(String[] args) {
        Class_2 object_1 = new Class_2(3456, "java", 23.342f, 'f', 90.121); // constructor can initialize object
        object_1.instance_method();

        Class_2 object_2 = new Class_2(34, "Java Programming", 100.343f, 'M', 12.4567);
        object_2.instance_method();

        Class_2 object_3 = new Class_2();
        object_3.instance_method();
    }
}

class Class_2 {
    int variable_1;
    String variable_2;
    float variable_3;
    char variable_4;
    double variable_5;

    Class_2(){
        System.out.println("default constructor");
        System.out.println("default values of the different data type : ");
    }

    Class_2(int p1, String p2, float p3, char p4, double p5) {  // parameterized constructor
        variable_1 = p1;
        variable_2 = p2;
        variable_3 = p3;
        variable_4 = p4;
        variable_5 = p5;
    }

    void instance_method() {
        System.out.println("integer   : " + variable_1);
        System.out.println("string    : " + variable_2);
        System.out.println("float     : " + variable_3);
        System.out.println("character : " + variable_4);
        System.out.println("double    : " + variable_5);
        System.out.println("\n");
    }
}

// default constructor can be created automatically

//there is no copy constructor in java

//there is no destructor in java. because java has a feature called garbage collector. so the dynamically allocated
//memory is free automatically by it

//java supports a special type of method called constructor for initializing a object when it is created.
//this is known as automatic initialization of object
//a class constructor if defined is called whenever a program creates an object of that class
//they are invoked directly when an object is created
//they don't have return type,not even void and hence can't return any values
//a constructor should have the same name as the class
//they can't be inherited, only members can be inherited and a constructor is not considered as a member