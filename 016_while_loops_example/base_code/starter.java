import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("what is your name?: ");
	String name = sc.nextLine();
	System.out.println("how many times should your name be printed (1-10)?: ");
	int numoftimes = sc.nextInt();
	int prints = 0;
	
	while (prints < numoftimes) {
		System.out.println(name);
		prints = (prints + 1);
	}
	}
}
