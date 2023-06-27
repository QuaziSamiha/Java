package basic;

public class Anonymous_Class {
    public static void main(String[] args) {

        Class object = new Class(){

            @Override
            void method() {
                System.out.println("main class");
            }
        };

        object.method();
    }
}

class Class{
    void method(){
        System.out.println("class");
    }
}