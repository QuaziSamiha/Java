package basic;

public class Call_by_Reference {
    public static void main(String[] args) {

        Call_by_Reference_1 object_1 = new Call_by_Reference_1();
        // object_1 is a reference variable of class Call_by_Reference_1

        object_1.v = "Programming";

        System.out.println("before calling  : " +object_1.v);
        object_1.method(object_1);
        System.out.println("\nafter calling : " +object_1.v);
    }
}

class Call_by_Reference_1{

    String v; // instance variable

    void method(Call_by_Reference_1 object_2){
        object_2.v = "Java";
    }
}

/*
// primitive data types are stored in stack memory and objects are stored in heap memory

stack memory         heap memory
---------------     ----------------
object_1             object of type : Call_by_Reference_1
                     attribute : "Programming"
object_2             object of type : Call_by_Reference_1
                     attribute : "Java"

explanation :
1.if we call a method by passing-a-reference type data (object,String etc) then it is known call-by-reference
2.changes to the formal parameter does affect the actual parameter
3.in call-by-reference original value gets change

*/