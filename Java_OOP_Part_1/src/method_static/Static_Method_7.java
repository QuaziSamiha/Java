package method_static;

public class Static_Method_7 {
    public static void main(String[] args) {

        Static_Method_6 object = new Static_Method_6();
        object.instance_method(); // instance method is calling through object

        Static_Method_6.static_method(); // static method is calling through class-name
    }
}
