import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      char n;
      Scanner sc=new Scanner(System.in);
        n=sc.next().charAt(0);
      if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u')
      {
       System.out.println("Vowel");
      }
      else if(n>=32&&n<=64)
      {
         System.out.println("Not an alphabet");
      }
      else
      {
         System.out.println("Consonant");
      }
    }
}