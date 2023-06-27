package NinthLecture;

public class LearningClass3 extends LearningClass2
{//this class cannot access private variable and private method of LearningClass2
    private float chargeInBattery;
    private String color;

    public LearningClass3()
    {
        super();
    }
    public LearningClass3(String manu, String model, String key, int cc, float fuel, float charge, String col)
    {
        super(manu, model, key, cc, fuel);
        chargeInBattery = charge;
        color = col;
    }

    public LearningClass3(String manu, String model, String key, int cc, float fuel, int year, float charge, String col)
    {
        super(manu, model, key, cc, fuel, year);
        chargeInBattery = charge;
        color = col;
    }

    public float getChargeInBattery()
    {
        return chargeInBattery;
    }

    public void setChargeInBattery(float chargeInBattery)
    {
        this.chargeInBattery = chargeInBattery;
    }

    public String getColor()
    {
        return color;
    }

    @Override
    public void printAllInfo()
    {
        super.printAllInfo();
        runForSecond(60);
        System.out.println("Amount of fuel after driving 60s : "+presentAmountOfFuel()+"L");
        System.out.println("Charge in Battery : "+getChargeInBattery());
        System.out.println("Car color : "+getColor());
    }
}
