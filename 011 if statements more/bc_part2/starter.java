import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number ");
	int a = sc.nextInt();
	System.out.println("Enter a second number ");
	int b = sc.nextInt();
	System.out. println("Enter a third number ");
	int c = sc.nextInt();
	
	if ((a > b) && (a > c) && (c < a) && (c < b)) {
		System.out.println("Your first input is the biggest number of the three.");
		System.out.println("Your third input is the smallest number of the three.");
	}	
	if ((a > b) && (a > c) && (b < c) && (b < a)) {
		System.out.println("Your first input is the biggest number of the three.");
		System.out.println("Your second input is the smallest number of the three.");
	}
	if ((b > a) && (b > c) && (a < b) && (a < c)) {
		System.out.println("Your second input is the biggest number of the three.");
		System.out.println("Your first input is the smallest number of the three.");
	}
	if ((b > a) && (b > c) && (c < b) && (c < a)) {
		System.out.println("Your second input is the biggest number of the three.");
		System.out.println("Your third input is the smallest number of the three.");
	}
	if ((c > a) && (c > b) && (b < a) && (b < c)) {
		System.out.println("Your third input is the biggest number of the three.");
		System.out.println("Your second input is the smallest number of the three.");
	}
	if ((c > a) && (c > b) && (a < c) && (a < b)) {
		System.out.println("Your third input is the biggest number of the three.");
		System.out.println("Your first input is the smallest number of the three.");
	}
	if ((a == b) && (b == c) && (a == c)) {
		System.out.println("All three of your numbers are equal.");
	}
	}	
}
