import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		// Type your code here
       int m;
      Scanner sc=new Scanner(System.in);
      m=sc.nextInt();
     if(m%4==0)
     {
       if(m%100==0)
       {
         if(m%400==0)
         System.out.println("Leap year");
         else
           System.out.println("Non Leap year");
       }
       else
			System.out.println("Leap year");
     }
      else
        System.out.println("Non Leap year");
    }
}