import java.io.*;
class Main
{
    public static void main(String args[])throws IOException
    {
        //fill your code;
      String stutype;
      float t, s=0,k=0;
      int b,h;
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    //Scanner sc=new Scanner(System.in);
      stutype=br.readLine();
      t=Float.parseFloat(br.readLine());
      b=Integer.parseInt(br.readLine());
      h=Integer.parseInt(br.readLine());
      
      switch(stutype)
      {
        case "MSDS":
          s=t+(float)b;
          System.out.printf("%.2f",s);
          break;
        case "MSH":
          s=t+(float)h;
           System.out.printf("%.2f",s);
          break;
         case "MGSDS":
         k=t*(1.5f);
          s=k+(float)b;
           System.out.printf("%.2f",s);
          break; 
          case "MGSH":
          k=t*(1.5f);
          s=k+(float)h;
           System.out.printf("%.2f",s);
          break; 
      }
    }
}