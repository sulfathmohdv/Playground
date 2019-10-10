import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill the code;
      int n,a,c=0,sum=0;
      Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
     do{
       a=sc.nextInt();
       sum=sum+a;
       c++;
     }
      while(sum<n);
        System.out.println("The number of turns is "+c);
    }
}