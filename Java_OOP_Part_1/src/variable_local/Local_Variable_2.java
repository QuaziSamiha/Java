package variable_local;

public class Local_Variable_2 {
    public static void main(String[] args) {
        int local_variable = 3278;
        System.out.println("local variable main method : " +local_variable);

        Class_Local_Variable_2 object = new Class_Local_Variable_2();
     // object.local_variable;  it will show an error
        object.method_1(12);
        object.method_2();
    }
}

class Class_Local_Variable_2 { // a class
     /*
    void method_1(static int p1, int p2){  // static variable can not be a local variable so p1 will show an error
     System.out.println("p2 is a local variable : ");
    }
    */
     void method_1(int local_variable){
         System.out.println("local variable method_1 : " +local_variable);
     }

     void method_2(){
         int local_variable = 55;
         local_variable += local_variable;
         System.out.println("local variable method_2 : " +local_variable);
     }
}