import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand= new Random();
	
	System.out.println("Enter a number between 1 and 1000: ");
	int a = sc.nextInt();
	int rand_a = rand.nextInt(999+1);
	int b = 0;
	int c = 0;
	int tries = 0;
	while (a != rand_a) {
		if (a > rand_a) {
			System.out.println("Your number was too high. Try again: ");
			a = sc.nextInt();
			tries = tries + 1;
		}
		if (a < rand_a) {
			System.out.println("Your number was too low. Try again: ");
			a = sc.nextInt();
			tries = tries + 1;
		}
	}
	if (a == rand_a) {
			System.out.println("Congratulations! You found the random number!");
			System.out.println("It took you " + tries + " tries to find the number!");
	}
	}
}
