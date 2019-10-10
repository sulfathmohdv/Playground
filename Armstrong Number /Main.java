
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    int copy_number = num;
	    int digit_count = 0;
        // find the digits count
	    if(num == 0){
	        System.out.print(num);
	    }
	    else{
	        while(num > 0){
	            digit_count++;
	            num = num / 10;
	        }
	    }
	    num = copy_number;
	    int sum = 0;
	    int pow = 1;
        /* Extract each digit 
           Compute power of each digit
           If sum of all values equal to the given number, then print Armstrong number
           Otherwise print not a armstrong number */
           
	    while(num > 0)
	    {
	        int rem = num % 10;
	        for(int count = 1; count <= digit_count; count++){
	            pow = pow * rem;
	        }
	        sum = sum  + pow;
	        pow = 1;
	        num = num / 10;
	    }
	    if(sum == copy_number){
	        System.out.print("Armstrong Number");
	    }
	    else{
	        System.out.print("Not a Armstrong Number");
	    }
	}
}