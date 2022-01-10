import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your first and last name: ");
	String x = sc.nextLine();
	int y = x.indexOf(" ");
	int z = y+1;
	int add = 0;
	int add1 = 1;
	int value = 0;
	String a = x.substring(y);
	int length1 = a.length();
	for (int i = 0; i < length1; i++) {
		System.out.print(x.substring(y,z));
		y = y+1;
		z = z+1;
	}


		
	}
}
