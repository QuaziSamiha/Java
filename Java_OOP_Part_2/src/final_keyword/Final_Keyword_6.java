package final_keyword;  // final keyword with parameter

public class Final_Keyword_6 {
    public static void main(String[] args) {

        Final_With_Parameter object = new Final_With_Parameter();

        object.instance_method_1(230);
        object.instance_method_2(400);
    }
}

class Final_With_Parameter{

    void instance_method_1(final int parameter){

//      parameter = 300; this line will show an error

        System.out.println("final parameter : " +parameter);
    }

    void instance_method_2(int parameter){

        parameter = 390;
        System.out.println("normal parameter : " +parameter);
    }
}
