package encapsulation;

public class Setter_and_Getter_Method_4 {
    public static void main(String[] args) {

        Setter_and_Getter_Method_3 object = new Setter_and_Getter_Method_3();

        /*  it will show an error
            object.v1 = "Java";
            object.v2 = 1222;
         */

        object.setMethod_1("Java");
        System.out.println("string  : " +object.getMethod_1());
        object.setMethod_2(122);
        System.out.println("integer : " +object.getMethod_2());
    }
}
