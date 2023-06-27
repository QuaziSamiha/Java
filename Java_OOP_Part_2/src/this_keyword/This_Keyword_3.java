package this_keyword;

public class This_Keyword_3 {
    public static void main(String[] args) {

        Class_This_Keyword_3 object_1 = new Class_This_Keyword_3("9th August", 2020);
        object_1.instance_method();

        Class_This_Keyword_3 object_2 = new Class_This_Keyword_3("java Programming", 2020, "15th August");
        object_2.instance_method();
    }
}

class Class_This_Keyword_3{

    // instance variables
    String v1;
    int v2;
    String v3;

    Class_This_Keyword_3(String v1, int v2){ // constructor
        this.v1 = v1;
        this.v2 = v2;
    }
// constructor overloading
    Class_This_Keyword_3(String v1, int v2, String v3){ // constructor

//      this.v1 = v1;
//      this.v2 = v2;

        this(v1,v2); // should be first statement

        this.v3 = v3;
    }

    void instance_method(){
        System.out.println("v1 = " +v1);
        System.out.println("v2 = " +v2);
        System.out.println("v3 = " +v3);
        System.out.println("\n");
    }
}