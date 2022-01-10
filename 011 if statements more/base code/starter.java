import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your first number: ");
	int a = sc.nextInt();
	System.out.println("Enter your second number: ");
	int b = sc.nextInt();
	
	if (a == b) {
		System.out.println("Your number match. They are the same!");
	}
	if (a != b) {
		System.out.println("Your numbers do not match. They are different!");
	}
	}
}
