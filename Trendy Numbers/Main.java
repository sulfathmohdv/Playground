import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      int n,a,b,t,count=0,o;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      t=n;
      for(int i=0;n>1;i++)
      {
        n=n/10;
        count++;
      }
      //count++;
        if(count==3)
        {
          n=t;
          a=n/10;
          b=a%10;
          o=b%3;
          if(o==0)
          {
            System.out.println("Trendy Number");
          }
          else
          {
            System.out.println("Not a Trendy Number");
          }
        }
      else
      {
        System.out.println("Not a Trendy Number");
      }
    }
}