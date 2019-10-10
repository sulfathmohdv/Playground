import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
     
     // int n;
      float avg;
      float sum=0;
      Scanner sc=new Scanner(System.in);
     // n=sc.nextInt(); 
       float arr[]=new float[40];
      for(int i=0;i<5;i++)
      {
        arr[i]=sc.nextFloat();
      }
      for(int i=0;i<5;i++)
      {
        sum=arr[i]+sum;
      }
      avg=sum/5;
      System.out.printf("%.2f",avg);
    }
}