package constructor;

public class Constructor_4 {
    public static void main(String[] args) {
        Parameterized_Constructor object = new Parameterized_Constructor(356,54);
    }
}

class Parameterized_Constructor{

    int instance_variable_1, instance_variable_2;

    Parameterized_Constructor(int parameter_1, int parameter_2){
        instance_variable_1 = parameter_1;
        instance_variable_2 = parameter_2;
        System.out.println("instance_variable_1 : " +parameter_1);
        System.out.println("instance_variable_2 : " +parameter_2);
        System.out.println("parameterized constructor invoked");
    }
}