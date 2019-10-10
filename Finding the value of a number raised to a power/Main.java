import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      double base,expt,power;
      Scanner sc=new Scanner(System.in);
      base=sc.nextInt();
      expt=sc.nextInt();
      power=Math.pow(base,expt);
      System.out.println(power);
    }
}