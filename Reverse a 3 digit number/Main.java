import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
     int n1,a,b,c,d;
    Scanner sc=new Scanner(System.in);
    n1=sc.nextInt();
    a=n1/10;
    b=a%10;
    c=n1/100;
    d=n1%10;
    System.out.printf("%d%d%d",d,b,c);
    
    
  }
}