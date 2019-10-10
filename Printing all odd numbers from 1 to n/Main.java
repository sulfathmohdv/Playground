import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
          int m;
      Scanner sc=new Scanner(System.in);
      m=sc.nextInt();
      for(int i=1;i<=m;i++)
      {
        if(i%2==1)
         System.out.printf("%d\n",i);
        }
	}
}