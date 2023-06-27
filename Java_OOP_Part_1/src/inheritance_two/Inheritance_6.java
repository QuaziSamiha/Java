package inheritance_two; // Inheritance_5, Inheritance_6, Inheritance_7 and Inheritance_8 are related

public class Inheritance_6 extends Inheritance_5{

    // setV1(), getV1(), setV2() and getV2() are member of this class also

    private String v; // private instance variable (data member)

    // public instance methods to use private instance variables of this class
    public void setV(String v) {
        this.v = v;
    }
    public String getV() {
        return v;
    }

    void method_subclass(){

//      instance method of subclass calling all the instance methods of superclass
        System.out.println("string : " +getV1());
        System.out.println("private variable of superclass : " +getV2());

        System.out.println("default variable of superclass : " +v3);

//      instance method of subclass calling the instance method of subclass
        System.out.println("\nstring : " +getV());
    }

}
