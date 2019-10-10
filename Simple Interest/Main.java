import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      int p,n;
      float r,intr;
      Scanner sc=new Scanner(System.in);
      p=sc.nextInt();
      n=sc.nextInt();
      r=sc.nextFloat();
      intr=(p*n*r)/100;
      System.out.println(intr);
    }
}