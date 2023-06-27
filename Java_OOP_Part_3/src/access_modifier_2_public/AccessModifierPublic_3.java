package access_modifier_2_public;  // class with access modifier

public class AccessModifierPublic_3 {
    public static void main(String[] args) {  // accessing public class from another class within same package

        AccessModifierPublic_1 object = new AccessModifierPublic_1();
        object.method_one();
    }
}
