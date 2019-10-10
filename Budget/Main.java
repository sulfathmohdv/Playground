import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      int a,b,c,d,e;
      float sum;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      d=sc.nextInt();
      e=sc.nextInt();
      sum=(350.34f*a)+(230.90f*b)+(190.55f*c)+(125.30f*d)+(180.90f*e);
      if(sum>15000)
      {
        System.out.println("No");
      }
      else
      {
        System.out.println("Yes");
      }
      
	}
}