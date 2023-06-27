package access_modifier;  // class with access modifier ( Public )

import access_modifier_1_public.* ; // import all the classes of package access_modifier_1_public

public class PublicAccessModifier_3 {
    public static void main(String[] args) {

        // creating object of two classes of same package

        AccessModifier_1 object_1 = new AccessModifier_1();
        AccessModifier_2 object_2 = new AccessModifier_2();

        object_1.method_1();
        object_2.method_2();
    }
}
