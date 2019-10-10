import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the value for n
	    int n = in.nextInt();
        // Extract last digit
	    int last_digit = n % 10;
        // Repeatedly remove last digit until it reaches the first digit 
		while(n >= 10)
		{
		   n = n / 10;
		}
        // Add first and last digit
		int sum = last_digit + n;
		System.out.print(sum);
	}
}


