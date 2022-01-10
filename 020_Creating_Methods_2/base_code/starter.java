import java.util.Scanner;
import java.util.Random;

class starter {
	public static int whilelooops(int a,int b){
	int operations = (0);
	int c = (1);
	while (operations < b) {
		c = (c*a);
		operations = operations + 1;
		if (operations == b) 
		{
			break;
		}
	}
	return c;
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a base (1-10): ");
	int a = sc.nextInt();
	System.out.println("Enter an exponent (1-9): ");
	int b = sc.nextInt();
	System.out.println((whilelooops(a,b)));
	}
}
