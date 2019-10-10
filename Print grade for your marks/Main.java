import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
       int m;
      Scanner sc=new Scanner(System.in);
      m=sc.nextInt();
     if(m>=85)
       System.out.println("A");
      else if(m>=75&&m<=86)
        System.out.println("B");
      else if(m>=65&&m<=76)
        System.out.println("C");
      else if(m>=55&&m<=66)
        System.out.println("D");
      else if(m>=45&&m<=56)
        System.out.println("E");
      else
        System.out.println("Fail");
         
    }
}