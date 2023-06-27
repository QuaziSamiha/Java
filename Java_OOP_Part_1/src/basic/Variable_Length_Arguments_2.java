package basic;

// variable length arguments -> varargs method
// A method that takes a variable number of arguments is called a varargs method

public class Variable_Length_Arguments_2 {
    public static void main(String[] args) {

        Variable_Length_Arguments object = new Variable_Length_Arguments();

        object.method_1("Java");
        object.method_1("Java", "Programming");
        object.method_1("Java", "C++", "C", "Python");

        object.method_2('q','u','a','z','i');
        object.method_2('s','a','m','i','h','a');
        object.method_2('A','s','m','a');
    }
}

class Variable_Length_Arguments{

    void method_1(String ... parameter){
        for (String v : parameter) {
            System.out.println(v);
        }
        System.out.println();
    }

    void method_2(char ... parameter){
        for (char i : parameter) {
            System.out.print(i);
        }
        System.out.print("\n");
    }
}