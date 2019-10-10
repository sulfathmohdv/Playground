import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      int m,d;
      float r,p;
      Scanner sc=new Scanner(System.in);
      m=sc.nextInt();
      r=sc.nextFloat();
     d=sc.nextInt();
      switch(m)
      {
        case 4:
        case 6:
        case 11:
        case 12:p=d*(r*1.2f);
          System.out.println(p);
          break;
        case 1:
        case 2:
        case 3:
        case 5:
        case 7:
        case 8:
        case 9:
        case 10:p=r*d;
         System.out.println(p);
          break; 
        default:
          System.out.println("Invalid Input");
      }
	}
}