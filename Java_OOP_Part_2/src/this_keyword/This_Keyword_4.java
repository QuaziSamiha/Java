package this_keyword;

public class This_Keyword_4 {
    public static void main(String[] args) {

        Class_This_Keyword_4 object = new Class_This_Keyword_4();
        object.method_2();
    }
}

class Class_This_Keyword_4{

    void method_1(){
        System.out.println("method_1");
    }

    void method_2(){
        this.method_1(); // it is automatically done by compiler
        System.out.println("method_2");
    }
}