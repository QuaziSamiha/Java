package NinthLecture;

public class LearningClass
{
    private int num = 10;
    static private LearningClass2 obj = new LearningClass2();
    static private LearningClass2 obj2;

    public static void main(String[] args)//main method
    {
        LearningClass2 obj3 = new LearningClass2("Mazada", "Axela", "asdf", 10000, 20);
        LearningClass3 obj4 = new LearningClass3("BMW", "7 Series", "zzxcz", 3000, 25, 10, "Green");

        obj2 = new LearningClass2("TOYOTA", "Allion", "qwerty", 1500, 30);
        //LearningClass2
        System.out.println("Manufacturer : "+obj2.manufacturerName);
        System.out.println("Model Name : "+obj2.getModelName());
        System.out.println("Password : "+obj2.getPassword("hsdhbcsjsn"));//if it doesn't match,it will show false
        System.out.println("1st car manufacturer : "+obj.manufacturerName);//it will show nothing
        System.out.println("1st car CC : "+obj.engineCC);
        System.out.println("2nd car CC : "+obj2.engineCC);
        System.out.println("Amount of Fuel : "+obj2.presentAmountOfFuel()+"L");
        obj2.addFuel(2);
        System.out.println("Amount of fuel after adding 2L : "+obj2.presentAmountOfFuel()+"L");
        obj2.runForSecond(60);
        System.out.println("Amount of fuel after driving 60s : "+obj2.presentAmountOfFuel()+"L");

        System.out.println("\n\n");
        //LearningClass2
        System.out.println("Manufacturer : "+obj3.manufacturerName);
        System.out.println("Model Name : "+obj3.getModelName());
        System.out.println("Password : "+obj3.getPassword("hsdhbcsjsn"));//if it doesn't match,it will show false
        System.out.println("1st car manufacturer : "+obj.manufacturerName);//it will show nothing
        System.out.println("1st car CC : "+obj.engineCC);
        System.out.println("2nd car CC : "+obj3.engineCC);
        System.out.println("Amount of Fuel : "+obj3.presentAmountOfFuel()+"L");
        obj3.addFuel(2);
        System.out.println("Amount of fuel after adding 2L : "+obj3.presentAmountOfFuel()+"L");
        obj3.runForSecond(60);
        System.out.println("Amount of fuel after driving 60s : "+obj3.presentAmountOfFuel()+"L");

        System.out.println("\n\n");
        //LearningClass3
        System.out.println("Manufacturer : "+obj4.manufacturerName);
        System.out.println("Model Name : "+obj4.getModelName());
        System.out.println("Password : "+obj4.getPassword("hsdhbcsjsn"));//if it doesn't match,it will show false
        System.out.println("1st car manufacturer : "+obj.manufacturerName);//it will show nothing
        System.out.println("1st car CC : "+obj.engineCC);
        System.out.println("2nd car CC : "+obj4.engineCC);
        System.out.println("Amount of Fuel : "+obj4.presentAmountOfFuel()+"L");
        obj4.addFuel(2);
        System.out.println("Amount of fuel after adding 2L : "+obj4.presentAmountOfFuel()+"L");
        obj4.runForSecond(60);
        System.out.println("Amount of fuel after driving 60s : "+obj4.presentAmountOfFuel()+"L");
        System.out.println("Charge in Battery : "+obj4.getChargeInBattery());
        System.out.println("Car color : "+obj4.getColor());
        //obj.presentAmountOfFuel();
        //String s = obj.manufacturerName;//since manufactureName is public in LearningClass2,we can access directly
        //String s2 = obj.modelName; it will show error since modelName is private in LearningClass2
        //int ob = obj.engineCC;
    }
}
