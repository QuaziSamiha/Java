package final_keyword;  // final keyword with local variable

public class Final_Keyword_5 {
    public static void main(String[] args) {

        Class_Final_Keyword_5 object = new Class_Final_Keyword_5();
        object.instance_method();
    }
}

class Class_Final_Keyword_5{

    void instance_method(){
        final int local_variable_1 = 120;
        final int local_variable_2;

        System.out.println("local_variable_1 : " +local_variable_1);

        local_variable_2 = 340; //local variable has to be initialized in this method before using it
        System.out.println("local_variable_2 : " +local_variable_2);
    }
}

//        int number;
//        number = 10;
//        number = 15;
//        System.out.println(+number);
//        output : 15
//        final int number;
//        number = 45;
//        number = 23; this line will show an error
