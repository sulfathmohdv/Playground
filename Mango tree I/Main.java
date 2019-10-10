import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      int r,c,n,i,j;
      Scanner sc=new Scanner(System.in);
      r=sc.nextInt();
      c=sc.nextInt();
      n=sc.nextInt();
      if((n%c==0)||(n%c==1)||(n<=c))
      {
       System.out.println("Yes") ;
      }
      else
      {
        System.out.println("No") ;
      }
    }     
}