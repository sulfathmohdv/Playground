import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      int a,b,pro,qnt,rem;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      pro=a*b;
      qnt=a/b;
      rem=a%b;
      System.out.printf("%d\n%d\n%d",pro,qnt,rem);
    }
}