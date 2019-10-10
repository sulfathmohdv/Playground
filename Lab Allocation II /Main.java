import java.util.*;
class Main
{
    public static void main(String args[])
    {
      int x,y,z;
      String n;
      Scanner sc=new Scanner(System.in);
      
        x=sc.nextInt();
       y=sc.nextInt();
      z=sc.nextInt();
      sc.nextLine();
     n=sc.nextLine();
    if(n.equals("L1"))
      {
          if(z<y)
          {
           System.out.println("L3");
          }
          else
          {
            System.out.println("L2");
          }
      }
    if(n.equalsIgnoreCase("L2"))
      {
          if(x<z)
          {
            System.out.println("L1");
          }
          else
          {
            System.out.println("L3");
          }
      }
      if (n.equalsIgnoreCase("L3"))
      {
          if(x<y)
          {
            System.out.println("L1");
          }
          else
          {
            System.out.println("L2");
          }
      }
    }
}
        
 