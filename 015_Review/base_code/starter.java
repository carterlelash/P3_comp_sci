import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	
	System.out.print("What is your name: ");
	String name = sc.nextLine();
	System.out.println("Give yourself a title (ex: conquerer)(don't put 'the' at the beginnning; it will be filled in.)");
	String title = sc.nextLine();
	System.out.println("Choose your role: Wizard, Warrior, or Rogue. ");
	String role = sc.nextLine();
	
	if (role.equals("warrior") || role.equals("Warrior")) {
		System.out.println("You have chosen to be the Warrior. May you fight with honor!");
	}
	if (role.equals("wizard") || role.equals("Wizard")) {
		System.out.println("You have chosen to be a Wizard. May your spells never fail you!");
	}
	if (role.equals("rogue") || role.equals("Rogue")) {
		System.out.println("You have chosen to be a Rogue. May you be light and silent on your feet!");
	}
	int points = 25;
	System.out.println("You have 25 points to spend. Spend them on the following characteristics as you wish.");
	System.out.println("Strength: ");
	int S = sc.nextInt();
	
	while (S > 10) { 
		System.out.println("You can't use more than 10 points per stat. Try Again. ");
		S = sc.nextInt();
	}
	if (S <= 10) {
		points = (points - S);
	}
	System.out.println("You have " + points + " points left." );
	System.out.println("Next trait- Dexterity: ");
	int D = sc.nextInt();
	
	while (D > 10) {
		System.out.println("The most points you can use on one stat is 10. Try again. ");
		D = sc.nextInt();
	}
	if (D <= 10)  {
		points = (points - D);
	}
	System.out.println("You have " + points + " points left.");
	System.out.println("Next trait- Intelligence: ");
	int I = sc.nextInt();
	
	if (I > 10) {
	System.out.println("The most points you can use on one stat is 10. Try again. ");
		I = sc.nextInt();
		points = (points - I);
	}
	if (I <= 10) {
		points = (points - I);
	}
	System.out.println("You have " + points + " points left.");
	System.out.println("Next trait- Constitution: ");
	int C = sc.nextInt();
	
	if (C > 10) {
			System.out.println("The most points you can use on one stat is 10. Try again. ");
			C = sc.nextInt();
			points = (points - C);
	}
	if (C <= 10) {
		points = (points - C);
	}
	System.out.println("You have " + points + " points left.");
	System.out.println("Last trait- Charisma: ");
	int H = sc.nextInt();
	
	if (H > 10) {
			System.out.println("The most points you can use on one stat is 10. Try again. ");
			H = sc.nextInt();
			points = (points - H);
	}
	if (H <= 10) {
		points = (points - H);
	}
	int pointsA = (25 % (25 - points));
	System.out.println("You have " + pointsA + " points left over");
	
	System.out.println("----------------------------------------------------------------------------");
	System.out.println(" Final Character Card ");
	System.out.println("You are " + name + ", the " + title + " of CVHS!");
	System.out.println("You chose to be the " + role);
	System.out.println("Your stats are as follows: ");
	System.out.println("Strength: " + S);
	System.out.println("Dexterity: " + D);
	System.out.println("Intelligence: " + I);
	System.out.println("Constitution: " + C);
	System.out.println("Charisma: " + H);
	System.out.println(" ");
	System.out.println("I wish you the best of luck on your travels!");
	}
}
