import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      int n,a,b,c;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      a=n/10;
      b=n%10;
      c=a+b;
      System.out.println("Alice must go in path-"+c);
	}
}