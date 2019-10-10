import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc=new Scanner(System.in);
      int n,c=0;
      float s=0.0f;
     
      do
      {
        n=sc.nextInt();
        if(n<0){
          s=(float)(s-1);
          
        }
       else if(n%2==1){
         s=s+1;
          
          c++;
        }
          else
          {
            
           s=(float)(s-0.5);
            //c++;
          }
         
      }while((n>0)&&(c!=3));
      System.out.printf("%.2f",s);

}
}