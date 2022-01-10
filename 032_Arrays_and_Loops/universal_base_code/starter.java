import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	int [] x = new int [1000];
	int y = 5;
	int add = 0;
	int add1 = 0;
	while (true) {
		y = rand.nextInt(99)+1;
		x[0+add] = y;
		add = add+1;
	if (add == 1000) {
		break;
	}
	}
	while (true) {
		System.out.println(x[0+add1]);
		add1 = add1+1;
		if (add1 == 1000) {
			break;
		}
	}
		
	}
}
