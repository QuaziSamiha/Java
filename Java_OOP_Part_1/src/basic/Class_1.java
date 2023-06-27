package basic;

public class Class_1 {
    public static void main(String[] args) {

        Class_2 object_1; // declaring object
        object_1 = new Class_2(); // creating object

        Class_2 object_2 = new Class_2();

        // accessing variable through object
        object_1.variable_1 = "Java";
        object_1.variable_2 = "Programming";
        object_1.variable_3 = 2020;
        System.out.println(object_1.variable_1);
        System.out.println(object_1.variable_2);
        System.out.println(object_1.variable_3);
    }
}
// a class is blue print or template from which individual objects are created
class Class_2{
    String variable_1, variable_2;
    int variable_3;
}