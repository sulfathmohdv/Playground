import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      int n,t1=0,t2=1,c=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(int i=0; i<=n; i++)
      {
        t1=t2;
        t2=c;
        c=t1+t2;
        if(i==n&&i>0)
        {
          System.out.println(t1);
        }
        
      }
    }
}