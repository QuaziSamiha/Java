package variable_instance;

public class Instance_Variable_4 {

    int instance_variable_1, instance_variable_2;

    void instance_method(int parameter){
        // accessing instance variable without object from instance method of main class
        instance_variable_1 = 12;
        instance_variable_2 = parameter;

        System.out.println(instance_variable_1+instance_variable_2);
    }

    public static void main(String[] args) {
        Instance_Variable_4 object = new Instance_Variable_4();
        object.instance_method(12);
    }
}