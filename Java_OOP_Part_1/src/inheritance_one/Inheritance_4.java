package inheritance_one;

//combination of two or more types of inheritance to design a program

public class Inheritance_4 {
    public static void main(String[] args) {

            Class_3 obj = new Class_3();
            obj.method();     
    }
}

class Class_1 {  //superclass
    // instance variables
    int v1 = 12;  // roll
    int v2 = 20;  // practical
}
    
class Class_2 extends Class_1 {  //subclass
    // instance variables
    int v3 = 72; // theory
    int v4 = v3 + v2; // total
}
    
interface Interface_1 {
    int v5 = 200;//by default public,static,final
    void method();//by default abstract,public
}

class Class_3 extends Class_2 implements Interface_1 {     
    
    int v6 = v4 + Interface_1.v5;//accessing class and interface variable

    public void method() {
        
        System.out.println("v1 : " +v1);//printing class variable
        System.out.println("v3 : " +v3);
        System.out.println("v2 : " +v2);
        System.out.println("Interface_1 : " +Interface_1.v5);
        System.out.println("v4 : " +v6);
    }
}


