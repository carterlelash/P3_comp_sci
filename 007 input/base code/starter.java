import java.util.Scanner;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	Scanner sc = new Scanner(System.in);
	System.out.println("What is your name? ");
	String a=sc.nextLine();
	System.out.println("What is your age? ");
	int b= sc.nextInt ();
	System.out.println("What month were you born (number; ex: february=2) ? ");
	int c= sc.nextInt ();
	System.out.println("What day were you born? ");
	int d= sc.nextInt ();
	System.out.println("What year were you born? ");
	int e= sc.nextInt ();
	System.out.println("If I have 4 quarters and 5 dimes, how much money do I have?");
	double f= sc.nextDouble ();
	System.out.println("Your name is " + a + " and you are " + b + " years old.");
	System.out.println(c + "/" + d + "/" + e + " is your birthdate.");
	System.out.println("You response for the last question was " + f);
	
	}
}
