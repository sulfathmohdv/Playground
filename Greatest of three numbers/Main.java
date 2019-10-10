import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
       int m,n,p;
      Scanner sc=new Scanner(System.in);
      m=sc.nextInt();
      n=sc.nextInt();
      p=sc.nextInt();
      if(m>n)
      {
        if(m>p)
          System.out.println(m);
        else
          System.out.println(p);
      }
      else if(n>p)
        System.out.println(n);
      else
        System.out.println(p);
    }
}