package final_keyword;  // final keyword with class

// We cannot inherit final class.

public class Final_Keyword_8 {
    public static void main(String[] args) {

        Final_Class object = new Final_Class();

        object.instance_method();
    }
}

final class Final_Class{

    int instance_variable = 1234;

    void instance_method(){
        System.out.println("final class : " +instance_variable);
    }

}