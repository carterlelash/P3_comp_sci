import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a word: ");
	String input = sc.nextLine();
	int add = 0;
	int add1 = 1;
	int value = 0;
	int length = input.length();
	for (int i = 0; i < length; i++) {
		System.out.println(input.substring(add,add1));
		add = add+1;
		add1 = add1+1;
		value = value+1;
	}
	

		
	}
}
