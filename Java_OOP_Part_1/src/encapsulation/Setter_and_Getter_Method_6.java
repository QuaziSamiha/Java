package encapsulation;

public class Setter_and_Getter_Method_6 {
    public static void main(String[] args) {

        Setter_and_Getter_Method_5 object = new Setter_and_Getter_Method_5();

        object.setV1("Java");
        System.out.println("string  : " +object.getV1());
        object.setV2(122);
        System.out.println("integer : " +object.getV2());
    }
}
