package final_keyword;  // final keyword with instance variable

/*
Final with instance variable :
1.final is used for following purpose :
   a.Making constant
   b.Preventing method to be overridden
   c.Preventing a class to be inherited
2.The final keyword is a way of making a variable as read-only. Its value is set once and then cannot
be changed
*/

public class Final_Keyword_1 {
    public static void main(String[] args) {

        Class_Final_Keyword_1 object = new Class_Final_Keyword_1();

        System.out.println(object.INSTANCE_VARIABLE);
    }
}

class Class_Final_Keyword_1{

    final int INSTANCE_VARIABLE = 340; // instance final variable declaring and initializing
    // it cannot be changed but it can be used
}