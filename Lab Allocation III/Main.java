import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      int x,y,z,n,count=0;
      Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      y=sc.nextInt();
      z=sc.nextInt();
      n=sc.nextInt();
      if(n<x)
      {
        count=count+1;
      }
      if(n<y)
      {
        count=count+1;
      }
       if(n<z)
      {
        count=count+1;
      }
      System.out.println(count);
    }
}