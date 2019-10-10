import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Get the n value
	    Scanner in  = new Scanner(System.in);
	    int n = in.nextInt();
        // Repeatedly remove last digit until it reaches the second digit
		while(n >= 100)
		{
		   n = n / 10;
		}
        // Extract last digit(i.e. second digit)
		int second_digit = n % 10;
		System.out.print(second_digit);
	}
}



