import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
/*
//technically incorrect, but i'm keeping it cause its funny
	System.out.println("Enter a sentence: ");
	String input = sc.nextLine();
	
	int value = 0;
	int length = input.length();
	int add = length-1;
	int add1 = length;
	for (int i = 0; i < length; i++) {
		System.out.print(input.substring(add,add1));
		add = add-1;
		add1 = add1-1;
	}
*/
	System.out.println("Enter a sentence: ");
	String input = sc.nextLine();
	
	int length = input.length();
	int a = input.indexOf(" ");
	String firstword = input.substring(0,a);
	String restofsentence = input.substring(a+1);
	System.out.println(restofsentence + " " + firstword);
	}
}
