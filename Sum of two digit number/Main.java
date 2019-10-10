import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	    int sum = (num % 10) + (num / 10);
		System.out.println(sum);
	}
}

