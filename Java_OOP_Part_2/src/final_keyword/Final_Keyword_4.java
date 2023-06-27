package final_keyword; // final keyword with static variable or class variable

public class Final_Keyword_4 {
    public static void main(String[] args) {
        
        Class_Final_Keyword_4 object = new Class_Final_Keyword_4();
        System.out.println(object.VARIABLE);
    }
}


class Class_Final_Keyword_4{

    final static int VARIABLE;

    static {
        VARIABLE = 340;
    }

    // we can initialize final static instance VARIABLE using static block only
}