import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
class Main
{
    public static void main(String args[])throws NumberFormatException,IOException
    {
        //fill your code;
      float input;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      input=Float.parseFloat(br.readLine());
      System.out.printf("%.2f",input);
        
    }
}