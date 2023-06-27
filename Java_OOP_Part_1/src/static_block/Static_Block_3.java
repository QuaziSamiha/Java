package static_block;

public class Static_Block_3 {
    static int v1;
    static String v2;

    static{ // it is a block which is static
        v1 = 9876;
        v2 = "Java Programming";
    }

    static void static_method(){
        System.out.println("integer : " +v1);
        System.out.println("string  : " +v2);
    }

    public static void main(String[] args) {

        Static_Block_3.static_method();
    }
}
