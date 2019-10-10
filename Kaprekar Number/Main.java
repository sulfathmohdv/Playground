import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code;
      int n,sq,a,c=0,b,d,sum,i=0,e=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      sq=n*n;
       a=sq;
     while(sq!=0)
      {
        sq=sq/10;
        c++;
      }
      sq=a;
      if(c==2)
      {
        b=sq/10;
        d=sq%10;
        sum=b+d;
          if(sum==n)
          {
            System.out.println("Kaprekar Number");
          }
         else
           {
         System.out.println("Not A Kaprekar Number"); 
           }
      }
     else if(c>2)  
     {
     do{
     sq=sq/100;
       i=i+1;
     }while(i !=1);
     
     e=a;
     e=e%1000;
     sum=sq+e;
     
     if(sum==a)
     {
      System.out.println("Kaprekar Number");
     }
     else
     {
      System.out.println("Not A Kaprekar Number");
     }
     }
    }
}