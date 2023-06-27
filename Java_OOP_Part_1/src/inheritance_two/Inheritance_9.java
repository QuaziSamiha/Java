package inheritance_two;  // use od instance of operator

public class Inheritance_9 {
    public static void main(String[] args) {

        Class_1 object_1 = new Class_1();
        Class_2 object_2 = new Class_2();
        Class_3 object_3 = new Class_3();

        System.out.println(object_1 instanceof Class_1);
        System.out.println(object_2 instanceof Class_1);
        System.out.println(object_3 instanceof Class_1);
        System.out.println(object_3 instanceof Class_2);
        System.out.println(object_2 instanceof Class_3);
    }
}

class Class_1 {
    // use od instance of operator
}

class Class_2 extends Class_1 {
    // use od instance of operator
}

class Class_3 extends Class_2 {
    // use od instance of operator
}
