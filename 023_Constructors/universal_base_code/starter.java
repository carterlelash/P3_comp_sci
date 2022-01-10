import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Pick your role: Wizard, Warrior, or Rogue: ");
	String role = sc.nextLine();
	BaseClass test = new BaseClass(role);
	
	System.out.println(test.A);
	System.out.println("Strength: " + test.S);
	System.out.println("Dexterity: " + test.D);
	System.out.println("Intelligence: " + test.I);
	System.out.println("Constitution: " + test.C);
	System.out.println("Charisma: " + test.c);

		
	}
}
