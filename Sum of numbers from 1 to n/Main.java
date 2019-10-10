import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
            int m,sum=0;
      Scanner sc=new Scanner(System.in);
      m=sc.nextInt();
      for(int i=1;i<=m;i++)
      {
        sum=sum+i;
      }
        System.out.println(sum);
    
	}
}