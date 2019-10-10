import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      if(n%2==0)
      {
        System.out.println("Even");
      }
      else
      {
        System.out.println("Odd");
      }
    }
}