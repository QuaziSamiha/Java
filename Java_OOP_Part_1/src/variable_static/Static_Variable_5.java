package variable_static;

public class Static_Variable_5 {
    public static void main(String[] args) {

        Static_Variable_4 object_1 = new Static_Variable_4("Code", 2020);
        Static_Variable_4 object_2 = new Static_Variable_4("Contest", 2021);

        Static_Variable_4.static_variable_2 = "RUET";

        object_1.instance_method();
        object_2.instance_method();
    }
}
