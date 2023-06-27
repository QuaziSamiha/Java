import java.util.Scanner;

public class ForthLecture {
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.println("Enter your name : ");
        String s1 = sc.nextLine();
        if(s1.length() > 15)
        {
            System.out.println("Your name is too long");
        }
        else
        {
           switch (s1.length())
           {
               case 3 :
                   System.out.println("Your name is too short!!");
                   break;
               case 7 :
                   System.out.println("You have a lucky name!!");
                   break;
               case  13 :
                   System.out.println("You have a 13 character name!!");
                   break;
               default:
                   System.out.println("Your name is ok!!");
                   break;
           }
        }
        //conditional operator ....... || (or operator)
        if(s1.length() < 15 && s1.length() > 5)
        {
            System.out.println("Your name is perfect!!");
        }

        int a = 3;
        int b = 9;
        a+=(b++);
        System.out.println("A:"+a + "  B:"+b);

        int c = 3, d = 9;
        c+=(--d);
        System.out.println("C:"+c + "  D:"+d);
    }
}
