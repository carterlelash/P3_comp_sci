import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("Enter a number between 1 and 1000: ");
	int a = sc.nextInt();
	int rand_b = rand.nextInt(999+1);
	if (rand_b == a) {
		System.out.println("By some miracle, you managed to pick the same number as the random generation. Congratulations!");
	}
	else if (a < rand_b) {
		System.out.println("Your number was too low. The random number was " + rand_b);
	}
	else if (a > rand_b) {
		System.out.println("Your number was too high. The random number was " + rand_b);
	}
	}
}
