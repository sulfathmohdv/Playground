import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      float x,b;
      int y;
      Scanner sc=new Scanner(System.in);
      x=sc.nextFloat();
      y=sc.nextInt();
      b=12*y;
      //loss=(12*y)-x;
      if(b>x)
      {
        System.out.println("Profit:"+(x-b));
         // System.out.printf("Profit : Rs.%.2f",b-x);
    // System.out.println("No profit nor loss");
       // System.out.printf("Loss : Rs.%.2f",(x-b));
      //  System.out.printf("\nLoss : Rs.12.00");
       
      }
      else if(x>b)
      {
        
       // System.out.printf("Loss : Rs.%.2f",x-b);
        System.out.printf("Loss : Rs.%.2f",x-b);
      }
      else
      {
         System.out.println("No profit nor loss");
        //System.out.println("Profit:"+(x-b));
      }
    }
}