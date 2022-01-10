import java.util.Random;
import java.util.Scanner;
public class starter {
	public static int checkPrime(int a) {
	int b = (a-1); 
	while (b > 0) {
		if (a%b > 0) {
			System.out.println(b);
		}
		b = (b - 1);
	}	
	System.out.println("\n");
		return (a);
	}
	public void printNames(int a) {
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter an integer: ");
    	int a = sc.nextInt();
    	System.out.println((checkPrime(a)));
	}
}