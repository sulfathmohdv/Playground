import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      int x,y,a;
      Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      y=sc.nextInt();
      if(x>y)
      {
        y=y+100;
        a=y-x;
        System.out.println(a);
      }
      else
      {
        a=y-x;
        System.out.println(a);
      }
    }
}