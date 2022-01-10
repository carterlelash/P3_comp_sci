import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any word: ");
	String x = sc.nextLine();
	int add = 0;
	int add1 = 1;
	int value = 0;
	int length = x.length();
	while (value < length) {
		System.out.println(x.substring(add,add1));
		add = add+1;
		add1 = add1+1;
		value = value+1;
	}

		
	}
}
