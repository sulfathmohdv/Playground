import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      int n,a=0,b=0,c=1,d;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(int i=0;i<n;i++)
      {
        System.out.print(a+" ");
        d=a+b+c;
        a=b;
        b=c;
        c=d;
        
      }
      
    }
}