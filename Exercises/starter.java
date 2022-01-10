import java.util.Scanner;
class starter {
	public static boolean check(int a, int b) {
	int c = (a*b);
	System.out.println("The result of multiplying your two numbers is " + c + ".");
	int d = (c/3);
	boolean e = false;
	if (c%3 == 0) {
		System.out.println("This number can be divided by 3. It would equal " + d + ".");
		e = true;
	}
	else {
		System.out.println("This number cannot be divided by 3.");
		e = false;
	}
	
	return(e);
	}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number: ");
	int a = sc.nextInt();
	System.out.println("enter a second number: ");
	int b = sc.nextInt();
	check(a,b);
	}
}
