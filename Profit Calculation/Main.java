import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your cod
      int x,a,b,pro;
      Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      a=sc.nextInt();
      b=sc.nextInt();
      pro=((x*a)-(x*b))-100;
      System.out.println("The profit obtained is Rs."+pro);
	}
}