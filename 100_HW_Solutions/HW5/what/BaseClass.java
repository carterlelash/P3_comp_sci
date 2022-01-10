package what;
import java.util.Scanner;
import java.util.Random;

public class BaseClass {
	public String starting;
	public int why;
	public int Randomize;
	public String didyouwin;
	public int bet1;
	public static int A;
	public static int B;
	public static int C;
	public String Game;
	
	public static void random(int Randomize) {
		Random rand = new Random();
		A = rand.nextInt(11);
		B = rand.nextInt(11);
		C = rand.nextInt(11);
	}
	public BaseClass(String starting) {
		if (starting.equals("Yes") || starting.equals("yes") || starting.equals("Y") || starting.equals("y")) {
			System.out.println("Great! Let's begin!");
		}
		else {
			System.out.println("That's ok. You'll be back soon.");
		}
	}
	public static void game(String Game) {
	int Game1 = 5;
	System.out.println("-----------------------------------");
	System.out.println("|" + A + "|" + B + "|" + C + "|");
	}
	public static void bet1(int bet) {
		
	}
	}
