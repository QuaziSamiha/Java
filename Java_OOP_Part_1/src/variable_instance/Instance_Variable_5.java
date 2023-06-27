package variable_instance;  // hiding of instance variable

public class Instance_Variable_5 {

    int v1, v2, v3;  // instance variables

    void instance_method(int v1, int v2, int v3){  // local variables

        this.v1 = v1;  // this.v1 is the instance variable and v1 is the local variable
        this.v2 = v2;
        this.v3 = v3;
        System.out.println((this.v1+this.v2+this.v3)); // adding instance variables
        System.out.println(v1+v2+v3); // adding local variables

    }

    public static void main(String[] args) {
        Instance_Variable_5 object = new Instance_Variable_5();

        object.instance_method(12,12,20); // passing value to instance method

        System.out.println("v1 : " +object.v1);
        System.out.println("v2 : " +object.v2);
        System.out.println("v3 : " +object.v3);
    }
}
