import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // fill your code
    int a,b,l,q;
    Scanner sc=new Scanner(System.in);
     a=sc.nextInt();
    b=sc.nextInt();
    l=(2*a)+(2*b);
    q=a*b;
    System.out.println(l+"m");
    System.out.println(q+"sqm");
  }
}