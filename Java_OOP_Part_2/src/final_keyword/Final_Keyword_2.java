package final_keyword;  // final keyword with instance variable

public class Final_Keyword_2 {
    public static void main(String[] args) {

        Class_Final_Keyword_2 object = new Class_Final_Keyword_2();

        System.out.println("instance variable : " +object.INSTANCE_VARIABLE);

        int local_variable = 200 + object.INSTANCE_VARIABLE;  // use
        System.out.println("local variable : " +local_variable);
    }
}

class Class_Final_Keyword_2{

    final int INSTANCE_VARIABLE;
    // blank final variable since it is not initialized yet
    // it will be initialized using constructor
    // we can initialize final instance variable using constructor(default or parameterized).
    // we cannot initialize final instance variable using object or method

    Class_Final_Keyword_2(){ // default constructor
        INSTANCE_VARIABLE = 1200;  //it cannot be changed but it can be used
    }
}

/*
Final with instance variable :
1.final is used for following purpose :
   a.Making constant
   b.Preventing method to be overridden
   c.Preventing a class to be inherited
2.The final keyword is a way of making a variable as read-only. Its value is set once and then cannot
be changed
*/
