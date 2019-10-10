import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    String name;
    String address;
    String contactno;
    String emailid;
    String prooftype;
    String proofid;
    int id=0,flag=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Registration");
    System.out.println("Enter your name");
    name=sc.nextLine();
    System.out.println("Enter your address");
    address=sc.nextLine();
    System.out.println("Contact Number");
    contactno=sc.nextLine();
    System.out.println("E-Mail ID");
    emailid=sc.nextLine();
    System.out.println("Enter proof type");
    prooftype=sc.nextLine();
    System.out.println("Enter proof id");
    proofid=sc.nextLine();
    for(int i=1;i<100;i++)
    {
      id=id+i;
      flag=1;
      break;
    }
    if(flag==1)
    {
       System.out.println("Customer Details");
   System.out.println(name);
      System.out.println(address);
      System.out.println(contactno);
      System.out.println(emailid);
       System.out.println(prooftype);
       System.out.println(proofid);
       System.out.println("Thank you for registering. Your id is "+id+"...");
     
    }
  }
}