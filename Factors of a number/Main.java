import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Get the value nun
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
        /*  Check all the numbers from 1 to num
            if number divides num, then print number
            Otherwise increment the number */
	    for(int factors = 1; factors <= num; factors++)
	    {
	        if(num % factors == 0)
	        {
	             System.out.println(factors);
	        }
	    }
	}
}