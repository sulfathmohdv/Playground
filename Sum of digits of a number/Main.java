import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in  = new Scanner(System.in);
        // Get the n value
	    int n = in.nextInt();
      
        // Initialize sum value as 0
	    int sum = 0;
      
        // Extract last digit repeatedly and store it in sum
        // until given number n reaches 0
		while(n > 0)
		{ 
           // Extract last digit
		   int rem = n % 10;
           // Adding each digit with sum 
		   sum = sum + rem;
           // Removing last digit
		   n = n / 10;
		}
		System.out.print(sum);
	}
}