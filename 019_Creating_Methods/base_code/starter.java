import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static String ToString(String a, String b){
		Scanner sc = new Scanner(System.in);
		String x = a;
		String y = b;
		String sentcomb = (x + " " + y);
		return sentcomb;
}
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a sentence: ");
	String sent1 = sc.nextLine();
	System.out.println("Enter a second sentence: ");
	String sent2 = sc.nextLine();
	
	System.out.println(ToString(sent1,sent2));
	}
}
