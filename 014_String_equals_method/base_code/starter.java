import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	System.out.println("Choose your role: Warrior, Wizard, or Rogue?: ");
	String role = sc.nextLine();
	
	if (role.equals("warrior")) {
		System.out.println("You have chosen to be a Warrior. May  you fight strong!");
	}
	else if (role.equals("wizard")) {
		System.out.println("You have chosen the role of Wizard. May you fight with the power of Merlin himself!");
	}
	else if (role.equals("rogue")) {
		System.out.println("You have chosen the Rouge. May you be quick and light on your feet!");
	}
	else {
		System.out.print("That doesn't work.");
	}
	}
}