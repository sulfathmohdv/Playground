import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      int a,l,b,sq,rec;
      float r,cir;
        Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      l=sc.nextInt();
      b=sc.nextInt();
      r=sc.nextFloat();
      sq=a*a;
      rec=l*b;
      cir=3.14f*r*r;
      System.out.printf("%d\n%d\n",sq,rec);
      System.out.printf("%.3f",cir);
      
      
      
    }
}