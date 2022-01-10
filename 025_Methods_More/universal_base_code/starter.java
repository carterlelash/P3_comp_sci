import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BaseClass test = new BaseClass();
		test.Strength(5);
		test.Dexterity(4);
		test.Intelligence(3);
		test.Constitution(2);
		test.Charisma(10);
		test.FinalCard(5, 4, 3, 2, 10, "Wizard");
	

		
	}
}
