package access_modifier_1_public;// class with access modifier

public class AccessModifier_2 {     // accessing public class from another package

    public void method_2(){  //Accessible in whole java world since public

        System.out.println("package name : access_modifier_1_public");
        System.out.println("class name   : AccessModifier_2");
        System.out.println("method name  : method_2()");
    }
}
