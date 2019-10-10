import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      int a,b,temp;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      temp=a;
      a=b;
      b=temp;
      System.out.printf("%d\n%d",a,b);
    }
}