import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	System.out.println("enter a number between 1 and 1000: ");
	int a = sc.nextInt();
	int rand_b = rand.nextInt(999+1);
	
	if (a == rand_b) {
		System.out.println("By some miracle, you managed to guess the random generated number. Congratulations!!!");
	}
	else if(a > rand_b) {
		System.out.println("Your number was too big. The random number was " + rand_b);
	}
	else if(a < rand_b) {
		System.out.println("Your number was too small. The random number was " + rand_b);
	}
	}
}	
