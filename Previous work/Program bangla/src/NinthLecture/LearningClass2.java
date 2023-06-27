package NinthLecture;

//for a car

//public variables and methods can be access directly by any packages
//default variables and methods can be access directly by any classes of same packages
//private variables and methods can be access directly by any any methods or variables of same class

public class LearningClass2
{  //public variable
   public String manufacturerName;
   //private variable
   private String modelName;//it can be access only method of this class
   private String carKeyValue;
   private float fuelAmount;
   final private float amountOfFuelConsumedPerSecond = 0.02f;//constant
//default variable...we can access default item directly by any class of same package
    int engineCC;
//protected variable
   protected int manufacturingYear;

//Polymorphism means more than one method of same method name but their parameters are not same

   public LearningClass2()//constructor
   {
      manufacturerName = new String();
      modelName = new String();
      engineCC = 1000;
      fuelAmount = 0;
      manufacturingYear = 0;
   }

   public LearningClass2(String var)//constructor
   {
      manufacturerName = new String(var);
      modelName = new String();
      engineCC = 0;
      fuelAmount = 0;
      manufacturingYear = 0;
   }

   public LearningClass2(String manu, String model, String key, int engineCC, float fuel)//constructor
   {
      manufacturerName = manu;
      modelName = model;
      carKeyValue = key;
      this.engineCC = engineCC;// this.engineCC means engineCC variable of this class
      fuelAmount = fuel;
      manufacturingYear = 0;
   }
   public LearningClass2(String manu, String model, String key, int engineCC, float fuel, int year)//constructor
   {
      this( manu, model, key, engineCC, fuel);//previous constructor ar value gula use kora holo
      manufacturingYear = year;
   }
//we can use static method without creating object

   public float presentAmountOfFuel()//it is a instance method
   {
      return fuelAmount;
   }

   public String getManufacturerName()//instance method
   {
      return manufacturerName;
   }

   public String getModelName()
   {
      return modelName;//
   }

   public void addFuel(float fuelAmount)
   {
      this.fuelAmount += fuelAmount;
   }
   public void runForSecond(int timeInSecond)
   {
      float usedFuel = timeInSecond*amountOfFuelConsumedPerSecond;
      fuelAmount -= usedFuel;
   }

   public boolean getPassword(String userInput)
   {//it will return true or false
      return userInput.equals(carKeyValue);//equals() method will check the password
   }

   public void printAllInfo()
   {
      System.out.println("\n\n");
      System.out.println("Manufacturer : " + manufacturerName);
      System.out.println("Model Name : " + getModelName());
      System.out.println("Password : " + getPassword("hsdhbcsjsn"));//if it doesn't match,it will show false
      System.out.println("1st car manufacturer : " + manufacturerName);//it will show nothing
      System.out.println("1st car CC : " + engineCC);
      System.out.println("2nd car CC : " + engineCC);
      System.out.println("Amount of Fuel : " + presentAmountOfFuel() + "L");
      addFuel(2);
      System.out.println("Amount of fuel after adding 2L : " + presentAmountOfFuel() + "L");
      runForSecond(60);
      System.out.println("Amount of fuel after driving 60s : " + presentAmountOfFuel() + "L");
   }
}
