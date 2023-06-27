package practice;

public class AbstractClassMethod {
    public static void main(String[] args) {

        MobileUser reference_variable;

        reference_variable = new Rahim();
        reference_variable.call();
        reference_variable.sendMessage();

        reference_variable = new Karim();
        reference_variable.sendMessage();
    }
}

abstract class MobileUser{
    void call(){
        System.out.println("call method\n");
    }
    abstract void sendMessage();  // functionality
}

class Rahim extends MobileUser{
    void sendMessage(){
        System.out.println("hi, what r u doing ? "); // implementing
    }
}

class Karim extends MobileUser{
    void sendMessage(){
        System.out.println("learning java !!! \nhow r u?"); // implementing
    }
}