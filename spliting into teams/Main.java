import java.util.Scanner;
class Main
{
public static void main(String args[])
{
// fill your codet
  int s,t,a,b;
  Scanner sc=new Scanner(System.in);
  s=sc.nextInt();
  t=sc.nextInt();
  a=s/t;
  b=s%t;
  System.out.println("The number of students in each team is "+a+" and left out is "+b);
}
}