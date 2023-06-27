public class FifthLecture
{
    public static void main (String[] args)
    {
         int a, b;
         a = 10;
         b = 20;
        System.out.println("sum:"+Sum(a,b));//calling method and passing value
        System.out.println("a:"+a);//printing the original value which remains unchanged

        System.out.println(a<b? "a is less than b":"b is less than a");//condition operator
        //condition true hole RHS print korbe r false hole LHS print korbe
        System.out.println(compare(a,b));//calling method and passing value
        int c = a<b? a:b;//this operator is useful for comparison one thing
        System.out.println("c:"+c);
        int d = a!=b? b:a;// we can also use ==, >, <, !=
        System.out.println("d:"+d);
    }
    static int Sum(int n1, int n2)//return type of this method is int
    {// java te sob somoi pass by value hoi method ar parameter ar khetre
         n1 += n2;
        return n1;
    }
    static String compare(int n1, int n2)
    {
        if(n1 < n2)
        {
            return "a is less than b";
        }
        else
        {
            return "b is less than b";
        }
    }
}
