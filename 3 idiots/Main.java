import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // fill your code 
    int x1,y1,x2,y2;
    float a,b;
    Scanner sc=new Scanner(System.in);
    x1=sc.nextInt();
    y1=sc.nextInt();
    x2=sc.nextInt();
    y2=sc.nextInt();
    a=(float)(x1+x2)/2;
    b=(float)(y1+y2)/2;
    System.out.printf("Binoy's house is located at (%.1f,%.1f)",a,b);
  }
}