package super_keyword;

public class Super_Keyword_6 {
    public static void main(String[] args) {
        Constructor_Two object = new Constructor_Two();
    }
}

class Constructor_One{
    Constructor_One(){
        System.out.println("Constructor_One");
    }
}

class Constructor_Two extends Constructor_One{
    Constructor_Two(){
        System.out.println("Constructor_Two");
    }
}