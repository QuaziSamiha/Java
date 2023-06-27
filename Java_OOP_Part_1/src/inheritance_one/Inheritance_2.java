package inheritance_one;  // multi-level inheritance

class Inheritance_2 {
    public static void main(String[] args) {
        Sub_Class_2 object = new Sub_Class_2(); // creating object of sub-class

        object.method_super(20,10); // calling method of super-class through object of sub-class
        object.method_2_sub(); // calling method of sub-class
    }
}

class Super_Class_2{
    int v1, v2; // instance variable of super-class
    void method_super(int p1, int p2){ // instance method of super-class
        v1 = p1;
        v2 = p2;
    }
}

class Intermediate_Sub_Class extends Super_Class_2{  // sub-class
    int v3 = 30; // instance variable of sub-class
    int method_1_sub(){
       int v = v1+v2+v3; // v = local variable of this method
       return v;
    }
}

class Sub_Class_2 extends Intermediate_Sub_Class{
    void method_2_sub(){
        System.out.println("v1 = " +v1);
        System.out.println("v2 = " +v2);
        System.out.println("v3 = " +v3);
        System.out.println("v  = " +method_1_sub());  // calling method of super-class of this sub-class
    }
}