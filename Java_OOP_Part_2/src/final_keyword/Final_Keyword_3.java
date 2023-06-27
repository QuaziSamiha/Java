package final_keyword;  // final keyword with static variable or class variable

public class Final_Keyword_3 {
    public static void main(String[] args) {

        Class_Final_Keyword_3 object = new Class_Final_Keyword_3();
        System.out.println(object.VARIABLE);
    }
}

class Class_Final_Keyword_3{

    final static int VARIABLE = 290;
}