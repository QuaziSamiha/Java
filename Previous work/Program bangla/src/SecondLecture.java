import java.util.Scanner;

public class SecondLecture
{
//karon ekhane kono main class nai..
    //ami main likhe enter press korlam..ete main function ta create hoe gelo..
// ekhn dekho run er con dekha jacche left e
    static Scanner sc = new Scanner(System.in);//for taking input
    public static void main(String[] args)
    {  //String is a class..it can be imagine as a data type
        String s1;//declaring string
        s1 = new String("Vondul!!");//Initializing
        System.out.println("Main Method : ");
        System.out.println(s1);

        //calling new method and passing value
        prln("This is our new method prln() : ");
        prln(s1);
        //calling new method and passing value
        pr("This is another new method pr() : ");
        pr(s1);

        //various method of String class
        pr("\n\nThe number of characters in s1 : "+s1.length());//length() is a method

        pr("\nEnter your name : ");
        String s2 = sc.nextLine();//taking input

        // else if statement
        if(s2.length() > 10)
        {
            prln("\nYour name is too long!");
        }
        else if(s2.length() < 3)
        {
            prln("Your name is too short!");
        }
        else
        {
            if(s2.length() == 7)//nested if
            {
                prln("Tou have a lucky name!!");
            }
            prln("\nYour name is ok!");
        }
    }
    static void prln(Object anyObject)//for printing anything in newline
    { //Object is a class...kon type ar data type pass kra hbe seta jana na thakle java
        //te Object class use kra hoi..
        System.out.println(anyObject);
    }
    static void pr(Object anyObject)//for printing anything in the same line
    {
        System.out.print(anyObject);
    }
}
