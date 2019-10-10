import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      int n,a,b,e=0,o=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      do
      {
       a=n%10;
        if(a%2==0)
        {
          e=e+a;
        }
        else if(a%2==1)
        {
          o=o+a;
        }
        n=n/10;
      }
      while(n>0);
       if(e==o)
       {
        System.out.println("Yes") ;
       }
      else{
         System.out.println("No");
      }
     }
   }