package method_overloading;  // method overloading in terms of number of parameters

// When more than one method with the same name is defined in the same class, it is known as method overloading.

public class Method_Overloading_2 {
    public static void main(String[] args) {

        Class_Method_Overloading_2 object = new Class_Method_Overloading_2();

        object.instance_method(10,24);
        object.instance_method();
        object.instance_method(5);
    }
}

class Class_Method_Overloading_2 {

    void instance_method(int parameter_1, int parameter_2) {

        int local_variable_1 = parameter_1;
        int local_variable_2 = parameter_2;
        System.out.println(local_variable_1 + local_variable_2);
    }

    void instance_method(int parameter_1) {

        int local_variable_1 = parameter_1;
        System.out.println(local_variable_1 * local_variable_1);
    }

    void instance_method(){
        System.out.println("method overloading");
    }
}


