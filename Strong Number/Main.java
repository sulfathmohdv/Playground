import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    int copy_number = num;
	    int sum = 0;
	    while(num > 0){
	        int rem = num % 10;
	        int fact = 1;
            // Finding factorial of each digit
	        for(int count = 1; count <= rem; count++)
	        {
	            fact = fact * count;
	        }
	        sum = sum + fact;
	        num = num / 10;
	    }
	    if(copy_number == sum)
	    {
	        System.out.println("Yes");
	    }
	    else{
	        System.out.println("No");
	    }
	}
}