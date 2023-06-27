package constructor;

public class Constructor_3 {
    public static void main(String[] args) {
        Default_Constructor object = new Default_Constructor();
    }
}

class Default_Constructor{

    int instance_variable;

    Default_Constructor(){
        instance_variable = 56;
        System.out.println("instance variable = " +instance_variable);
        System.out.println("default constructor invoked");
    }
}
