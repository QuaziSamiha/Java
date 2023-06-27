package encapsulation;  // class Setter_and_Getter_Method_4 and Setter_and_Getter_Method_3 are related

public class Setter_and_Getter_Method_3 {

    // encapsulation
    private String v1; // private access specifier
    private int v2;   // private access specifier

    public void setMethod_1(String p){
        v1 = p;
    }
    public String getMethod_1(){
        return v1;
    }
    public void setMethod_2(int p){
        v2 = p;
    }
    public int getMethod_2(){
        return v2;
    }
}
