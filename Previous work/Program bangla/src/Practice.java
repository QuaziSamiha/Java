import java.util.Scanner;

public class Practice {

    static Scanner sc = new Scanner(System.in);

    static String[] bookname = {"Java", "C", "Python"};//declaring and initializing array
    static final double studentDiscount = 0.3;//declaring and initializing three variable
    static final double teacherDiscount = 0.4;
    static final double allienDiscount = 0.0;

    // static final float teacherDiscount = 0.4f; 0.4 ar por f likhle error asbe

    public static void main(String[] args)//main method
    {
        print(".......Welcome To Our Book Store......");
        print("Which book do you want? \nAns: ");

        String b = sc.nextLine();//taking book name as a input
        if (bookname[0].toLowerCase().equals(b.toLowerCase()))
        { // book ar nam small capital letter ase...abar input a boi ar nam nana rokom
            //hote pare...tai toLowerCase() method dia sob gula small letter kora hoise
            //equals() method dia compare kora hoise
            print("You opted for " + bookname[0] + " book");//print() is a method
            calculatePrice(bookname[0]);//calling method and passing book name as a value
        }
        else if (bookname[1].toLowerCase().equals(b.toLowerCase()))
        {
            print("You opted for " + bookname[1] + " book");
            calculatePrice(bookname[1]);//calling method ans passing book name as a value
        }
        else if (bookname[2].toLowerCase().equals(b.toLowerCase()))
        {
            print("You opted for " + bookname[2] + " book");
            calculatePrice(bookname[2]);//calling method and passing book name as a value
        }
        else
            {
            System.out.println("Sorry we don't have the book");
        }
    }
    static void print(Object anyObject)//method for printing something in new line
    {
        System.out.println(anyObject);
    }

    static void calculatePrice(String book)//method for determining person and calling
    // another method to show book price
    {
        print("Are you Student, Teacher or Allien ? \nAns : ");
        String ans = sc.nextLine();//taking input to know person type

        double price = 200;//let price of each book is 200

        if(ans.toLowerCase().equals("teacher"))
        {
           price = price-(price*teacherDiscount);
           showPrice(price);//calling method and passing value to show the price
        }
        else if(ans.toLowerCase().equals("student"))
        {
           price -= (price*studentDiscount);
           showPrice(price);//calling method and passing value to show the price
        }
        else if(ans.toLowerCase().equals("allien"))
        {
           price = price-(price*allienDiscount);
           showPrice(price);//calling method and passing value to show the price
        }
        else
        {
            print("Soory! We can't serve you.");
        }
    }

    static void showPrice(double p)//method for showing price
    {
        print("Your total payble amount "+p+" tk");//calling method and passing value
        print("-------------THANK YOU FOR SHOPPING----------");
    }
}
