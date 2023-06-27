package inheritance_one;  // single inheritance

class Inheritance_1 {
    public static void main(String[] args) {
        Sub_Class_1 object = new Sub_Class_1(); // creating object of sub-class

        object.method_super(36,12); // calling method of super-class through object of sub-class
        object.method_2_sub();  // calling method of sub-class
    }
}

class Super_Class_1{
    int v1, v2; // instance variable of super-class
    void method_super(int p1, int p2){ // instance method of super-class
        v1 = p1;
        v2 = p2;
    }
}

class Sub_Class_1 extends Super_Class_1{
    int method_1_sub(){  // instance method of sub-class
        int v = v1 + v2; // v = local variable of this method
        return v;
    }
    void method_2_sub(){ // instance method of sub-class
        System.out.println("v1 = " +v1);
        System.out.println("v2 = " +v2);
        System.out.println("v  = " +method_1_sub()); // // calling method of super-class of this sub-class
    }
}
