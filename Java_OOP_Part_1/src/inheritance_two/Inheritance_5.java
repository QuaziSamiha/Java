package inheritance_two; // Inheritance_5, Inheritance_6, Inheritance_7 and Inheritance_8 are related

// single inheritance

public class Inheritance_5 {

    // private instance variables ( data members)
    private String v1;
    private int v2;

    // default instance variable
    String v3;

    // instance methods to use private instance variables of this class
    public void setV1(String v1) {
        this.v1 = v1;
    }
    public String getV1() {
        return v1;
    }
    public void setV2(int v2) {
        this.v2 = v2;
    }
    public int getV2() {
        return v2;
    }
}
