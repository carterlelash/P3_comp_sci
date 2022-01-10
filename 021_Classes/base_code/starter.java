import java.util.Scanner;
import java.util.Random;
class myCharacter {
	String Role = ("Wizard");
	int Strength = (0);
	int Dexterity = (0);
	int Intelligence = (0);
	int Constitution = (0);
	int Charisma = (25);
	
}

class starter{
	public static void main(String args[]) {
		myCharacter mychar = new myCharacter();
		System.out.println(mychar.Role);
		System.out.println("Strength: " + mychar.Strength);
		System.out.println("Dexterity: " + mychar.Dexterity);
		System.out.println("Intelligence: " + mychar.Intelligence);
		System.out.println("Constitution: " + mychar.Constitution);
		System.out.println("Charisma: " + mychar.Charisma);
	}
}

