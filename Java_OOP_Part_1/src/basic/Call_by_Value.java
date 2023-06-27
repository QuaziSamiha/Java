package basic;

// variables of primitive data type store in stack memory

public class Call_by_Value {
    public static void main(String[] args) {

        Call_by_Value_1 object = new Call_by_Value_1();

        int actual_parameter = 11; // primitive data type

        System.out.println("actual-parameter before calling method  : " +actual_parameter);
        object.method(actual_parameter);
        System.out.println("\nactual-parameter after calling method : " +actual_parameter);
    }
}

class Call_by_Value_1{

    void method(int formal_parameter){
        formal_parameter = 20;
    }
}

/*
in stack memory :
int actual_parameter = 11
int formal_parameter = 11
int formal_parameter = 20

explanation :
1.if we call a method by passing a value (primitive data)then it is known as call-by-value
2.the value is copied to a method parameter
3.changes to the formal doesn't affect the actual parameter
4.in call-by-value original value doesn't change

*/