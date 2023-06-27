package variable_static;

public class Static_Variable_7 {
    public static void main(String[] args) {
        System.out.println("static variable : ");
        Static_Variable_6 ob1 = new Static_Variable_6();
        ob1.method();

        Static_Variable_6 ob2 = new Static_Variable_6();
        ob2.method();

        Static_Variable_6 ob3 = new Static_Variable_6();
        ob3.method();
//--------------------------------------------------------------------------------------------
        System.out.println("\nnon-static variable : ");
        Static_Variable_8 ob4 = new Static_Variable_8();
        ob4.method();

        Static_Variable_8 ob5 = new Static_Variable_8();
        ob5.method();

        Static_Variable_8 ob6 = new Static_Variable_8();
        ob6.method();
    }
}
