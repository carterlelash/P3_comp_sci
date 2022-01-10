package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role = ("no role");
	int S = 0;
	int D = 0;
	int I = 0;
	int C = 0;
	int c = 0;
	public static void pick(String role) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick your role: Wizard, Warrior, or Rogue: ");
		role = sc.nextLine();
	}
	public void Strength(int str) {
		S = str;
		return;
	}
	public void Dexterity(int Dex) {
		D = Dex;
		return;
	}
	public void Intelligence(int intel) {
		I = intel;
		return;
	}
	public void Constitution(int cons) {
		C = cons;
		return;
	}
	public void Charisma(int cha) {
		c = cha;
		return;
	}
	public void FinalCard(int S, int D, int I, int C, int c, String role) {
		Scanner sc = new Scanner(System.in);
		System.out.println("You chose to be a " + role + "!");
		System.out.println("Your stats are as follows: ");
		System.out.println("Strength: " + S);
		System.out.println("Dexterity: " + D);
		System.out.println("Intelligence: " + I);
		System.out.println("Constitution: " + C);
		System.out.println("Charisma: " + c);
		return;	
	}
}

