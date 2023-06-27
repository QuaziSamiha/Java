package super_keyword; // Super with Default Constructor

/*
1.use super() in subclass to initialize superclass default constructor
2.super() is optional in subclass
3.super() should be first statement
*/

public class Super_Keyword_4 {
    public static void main(String[] args){
        Class_2_Super_Keyword_4 object = new Class_2_Super_Keyword_4(); // called default constructor of subclass automatically
    }
}

//constructor is not a member of a class, so it cannot be inherited

class Class_1_Super_Keyword_4 {  // superclass

    Class_1_Super_Keyword_4() { //default constructor
        System.out.println("Superclass Default Constructor");
    }
}


class Class_2_Super_Keyword_4 extends Class_1_Super_Keyword_4 {  //subclass

    //default constructor of subclass at first invokes default constructor of superclass

    Class_2_Super_Keyword_4() {  //default constructor

        // super(); this line is optional

        int local_variable = 200;
        System.out.println("Subclass Default Constructor : " +local_variable);
    }
}



