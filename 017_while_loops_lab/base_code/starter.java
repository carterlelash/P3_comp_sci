import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name?: ");
	String name = sc.nextLine();
	System.out.println("How many times should your name be copied (1-10)?: ");
	int a = sc.nextInt();
	int b = 1;
	while(true)
	{
		System.out.println(name);
		if( a == b)
		{
			break;
			
		}
		b = b+1;
}
}
}
