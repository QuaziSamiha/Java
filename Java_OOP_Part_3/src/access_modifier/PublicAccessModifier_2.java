package access_modifier;  // class with access modifier ( Public )

// accessing public class of two different package

import access_modifier_1_public.AccessModifier_1;
import access_modifier_2_public.AccessModifierPublic_1;

public class PublicAccessModifier_2 {
    public static void main(String[] args) {

        AccessModifier_1 object_1 = new AccessModifier_1();
        AccessModifierPublic_1 object_2 = new AccessModifierPublic_1();

        object_1.method_1();

        System.out.print("\n");

        object_2.method_one();
    }
}
