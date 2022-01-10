import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Wizard[] x = new Wizard[100];
	for (int i=0; i<100; i++) {
		x[i] = new Wizard("Bob");
	}
	Warrior[] y = new Warrior[100];
	for (int i=0; i<100; i++) {
		y[i] = new Warrior("Joe");
	}
	int add1 = 0; // wizards
	int add2 = 0; // warriors
	while (add1 < 99 && add2 < 99) {
		x[add1].attack(y[add2]);
		if (x[add1].isDead()) {
			add1 = add1 + 1;
		}
		y[add2].attack(x[add1]);
		if (y[add2].isDead()) {
			add2 = add2 + 1;
		}
	}
	if (add1 == 99) {
		System.out.println("The Warriors won!!");
		System.out.println("They have " + (99-add2) + " warriors left!");
	}
	if (add2 == 99) {
		System.out.println("The Wizards won!!");
		System.out.println("They have " + (99-add1) + " wizards left!");
	}
}
}
