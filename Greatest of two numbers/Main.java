import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
       int m,n;
      Scanner sc=new Scanner(System.in);
      m=sc.nextInt();
      n=sc.nextInt();
      if(m>n)
      {
        System.out.println("num1 is the greatest number");
      }
      else
        System.out.println("num2 is the greatest number");
	}
}