package variable_instance;

public class Instance_Variable_3 {

    int instance_variable_1 = 45;
    String instance_variable_2 = "Java";

    public static void main(String[] args) {

        Instance_Variable_3 object = new Instance_Variable_3();
        // creating object of main class to access instance variable of main class from main method

        System.out.println("instance_variable_1 : " +object.instance_variable_1);
        System.out.println("instance_variable_2 : " +object.instance_variable_2);
        object.instance_variable_2 = "Programming";
        System.out.println("instance_variable_2 : " +object.instance_variable_2);
    }
}
