package string_class;  // use of indexOf() and lastIndexOf() method

public class String_Class_12 {

    public static void main(String[] args) {

        String object = "Java is a programming language"; // 30 characters total
        System.out.println(object);
        
        int variable;
        
        variable = object.indexOf('a'); // this method will return first index of a specific latter
        System.out.println("\nfirst index of \'a\' : " +variable);
        variable = object.lastIndexOf('a'); // this method will return last index of a specific latter
        System.out.println("last index of \'a\' : " +variable);

        variable = object.indexOf('J'); // this method will return first index of a specific latter
        System.out.println("\nfirst index of \'J\' : " +variable);
        variable = object.lastIndexOf('J'); // this method will return last index of a specific latter
        System.out.println("last index of \'J\' : " +variable);

        variable = object.indexOf('m'); // this method will return first index of a specific latter
        System.out.println("\nfirst index of \'m\' : " +variable);
        variable = object.lastIndexOf('m'); // this method will return last index of a specific latter
        System.out.println("last index of \'m\' : " +variable);
    }
}
