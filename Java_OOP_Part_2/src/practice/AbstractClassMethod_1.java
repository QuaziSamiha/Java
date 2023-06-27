package practice;

public class AbstractClassMethod_1 {
    public static void main(String[] args) {
        Area ref_v;

        ref_v = new RectangleArea(5,5);
        ref_v.area();
        ref_v = new TriangleArea(5,5);
        ref_v.area();
        ref_v = new CircleArea(5);
        ref_v.area();
    }
}

abstract class Area{

    double dim1, dim2;

    Area(double dim1, double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract void area();
}

class RectangleArea extends Area{

    RectangleArea(double p1, double p2){
        super(p1,p2);
    }

    @Override
    void area() {
        System.out.println("rectangle area : " +(dim1*dim2));
    }
}

class TriangleArea extends Area{

    TriangleArea(double p1, double p2){
        super(p1,p2);
    }

    @Override
    void area() {
        System.out.println("triangle area : " +(0.5*dim1*dim2));
    }
}

class CircleArea extends Area{

    CircleArea(double p){
        super(p,p);
    }

    @Override
    void area() {
        System.out.println("circle area : " +(Math.PI*dim1*dim2));
    }
}
