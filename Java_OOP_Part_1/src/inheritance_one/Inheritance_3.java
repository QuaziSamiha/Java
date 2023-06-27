package inheritance_one;  // hierarchical inheritance : more than one subclass from one superclass

class Inheritance_3 {
    public static void main(String[] args) {
        Class_One object_1 = new Class_One(); // creating object of sub-class
        Class_Two object_2 = new Class_Two(); // creating object of sub-class

        object_1.method_super(70,30); // calling method of super-class through object of sub-class
        object_1.method_2_sub(); // calling method of sub-class

        object_2.method_super(7,10); // calling method of super-class through object of sub-class
        object_2.method_2_sub(); // calling method of sub-class
    }
}

class Super_Class_3{
    int v1, v2; // instance variable of super-class
    void method_super(int p1, int p2){ // instance method of this class (of super-class)
        v1 = p1;
        v2 = p2;
    }
}

class Class_One extends Super_Class_3{  // Class_One is sub-class
    int method_1_sub(){   // instance method of this class (of sub-class)
        return (v1+v2); // using instance variable of super-class
    }
    void method_2_sub(){  // instance method of this class (of sub-class)
        System.out.println("v1    = " +v1); // v1 is instance variable of super-class
        System.out.println("v2    = " +v2); // v2 is instance variable of super-class
        System.out.println("v1+v2 = " +method_1_sub()); // calling a instance method by a instance method of same class
        System.out.println("Sub-Class One \n\n");
    }
}

class Class_Two extends Super_Class_3{  // Class_Two is sub-class
    int method_1_sub(){   // instance method of this class (of sub-class)
        return (v1*v2); // using instance variable of super-class
    }
    void method_2_sub(){  // instance method of this class (of sub-class)
        System.out.println("v1    = " +v1); // v1 is instance variable of super-class
        System.out.println("v2    = " +v2); // v2 is instance variable of super-class
        System.out.println("v1*v2 = " +method_1_sub()); // calling a instance method by a instance method of same class
        System.out.println("Sub-Class Two \n\n");
    }
}