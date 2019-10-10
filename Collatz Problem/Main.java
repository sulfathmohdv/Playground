import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      int n,count=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      System.out.println(n);
      for(int i=1;n!=1;i++)
      {
       // if(n>1)
       // {
        	if(n%2==0)
        	{
          	n=n/2;
          	//count=count+1;
        	}
        	else
        	{
          	n=3*n+1;
          //	count=count+1;
        	}
        count++;
        System.out.println(n);
      }
      System.out.println(count);
    }
}