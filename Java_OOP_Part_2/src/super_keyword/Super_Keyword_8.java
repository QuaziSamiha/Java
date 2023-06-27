package super_keyword; // Super_Keyword_8, Super_Keyword_9 and Super_Keyword_7 are related

public class Super_Keyword_8 extends Super_Keyword_7{

    // v1, v2 and method is also in this class

    int v3;

    Super_Keyword_8(String p1, double p2, int p3){

        super(p1,p2); // first statement
        v3 = p3;
    }

    void method(){ // override

//      System.out.println("v1 = " +v1);
//      System.out.println("v2 = " +v2);

        super.method();

        System.out.println("v3 = " +v3);
    }

}
