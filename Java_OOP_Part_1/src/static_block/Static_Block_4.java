package static_block;

public class Static_Block_4 {

    static{
        System.out.println("static block executes before main method");
    }

    public static void main(String[] args) {
        System.out.println("main method executes after static block");
    }
}
