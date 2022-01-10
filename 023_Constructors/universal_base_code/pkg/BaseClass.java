package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	public int S;
	public int D;
	public int I;
	public int C;
	public int c;
	public String role;
	public String A;
	
	public BaseClass() {
		S = 5;
		D = 6;
		I = 7;
		C = 8;
		c = 9;
		role = ("no role");
		A = ("no string, yet");
	}
	public BaseClass(String role) {
	if (role.equals("Wizard")) {
		A = ("You have chose the Wizard.! A powerful sorcerer, you shall be! \nYour role is wizard.");
	}
	if (role.equals("Warrior")) {
		A = ("You have chosen the Warrior! Fight with honor! \nYour role is Warrior.");
	}
	if (role.equals("Rogue")) {
		A = ("You have chosen the Rogue! Quick and quiet on your feet. \nYour role is Rogue.");
	}
	}
}

