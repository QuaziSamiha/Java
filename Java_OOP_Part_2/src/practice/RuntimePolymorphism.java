package practice;

public class RuntimePolymorphism {
    public static void main(String[] args) {

        System.out.println("conventional way");
        Shape s = new Shape();
        Rectangle r = new Rectangle(10,20);
        Triangle t = new Triangle(10,20);
        System.out.println(s.area());
        System.out.println(r.area());
        System.out.println(t.area());

        System.out.println("\nruntime polymorphism");
        Shape s1 = new Shape();
        Shape s2 = new Rectangle(10,20); // reference variable of Shape class (s2) refers the object of Rectangle class
        Shape s3 = new Triangle(10,20); // reference variable of Shape class (s3) refers the object of Triangle class
        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());

        System.out.println("\nruntime polymorphism");
        Shape[] array_shape = new Shape[3];
        array_shape[0] = new Shape();
        array_shape[1] = new Rectangle(10,20); // reference variable of Shape class (s2) refers the object of Rectangle class
        array_shape[2] = new Triangle(10,20); // reference variable of Shape class (s3) refers the object of Triangle class
        for (int i = 0; i < 3; i++) {
            System.out.println(array_shape[i].area());
        }
    }
}

class Shape{
    double area(){ // overridden method
        // only declaring it. it will be defined in subclass
        System.out.print("area : ");
        return 0; // as it has to return something
    }
}

class Rectangle extends Shape{
    // area() is already here
    double length, width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    double area(){ // override method
        System.out.print("area of rectangle : ");
        return (length*width);
    }
}

class Triangle extends Shape{
    // area() is already here
    double base, height;
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    double area(){
        System.out.print("area of triangle : ");
        return (0.5*base*height);
    }
}