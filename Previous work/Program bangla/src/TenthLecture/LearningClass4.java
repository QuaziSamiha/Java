package TenthLecture;

//import NinthLecture.LearningClass3; this line will only import LearningClass3 of package NinthLecture
import NinthLecture.*;//but this line import all the classes of package NinthLecture
public class LearningClass4
{
    public static void main(String[] args)
    {
        LearningClass2 obj6 = new LearningClass2("MITSUBISHI", "Lancer", "poiu"
                , 2500, 15, 2013);

       LearningClass3 obj5 = new LearningClass3("NISSAN", "350z", "zxcv", 4000, 30, 2011,
               12, "Grey");//it is a class of package NinthLecture
        //String s = obj5.manufacturerName; we can access manufacturename since it is a public variable in package NinthLecture
        //String s = obj5.engineCC; it will show error since it is a default variable in package NinthLecture

        //LearningClass.main(null);//using main method of LearningClass of package NinthLecture
        obj5.printAllInfo();
        obj6.printAllInfo();
    }

}
