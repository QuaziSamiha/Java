public class SixLecture
{
    public static void main(String[] args)
    {
       int[] arr = new int[100];
       int i = 10;
       //how to use while loop
       while (i > 0)
       {
           arr[i-1] = i;
           i--;
       }
       while (i<10)
       {
           System.out.println("Array["+i+"] : "+arr[i]);
           i++;
       }
       //Difference between while loop and do-while loop and how to use while loop
       int j = 2;
       do {//in do-while loop at least one time run the loop and then check the condition
           System.out.println("do-while loop : ");
           System.out.println("j:"+j);
       }while (j<2);//condition

       while (j<2)//in while loop first check the condition
       {
           System.out.println("while loop : ");
           System.out.println("j:"+j);
       }

       int k = 2;
       do {
           System.out.println("do-while loop : ");
           System.out.println("k:"+k);
           k--;
       }while (k<2 && k>0);

       k = 2;
       while (k<2 && k>0)
       {
           System.out.println("while loop : ");
           System.out.println("k:"+k);
           k--;
       }

        int l = 1;
        do {
            System.out.println("do-while loop : ");
            System.out.println("l:"+l);
            l--;
        }while (l<2 && l>0);

        l = 1;
        while (l<2 && l>0)
        {
            System.out.println("while loop : ");
            System.out.println("l:" +l);
            l--;
        }
        }

}
