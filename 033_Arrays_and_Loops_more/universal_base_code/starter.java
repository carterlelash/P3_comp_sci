import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	Random rand = new Random();
	int [] x = new int [1000];
	int min = 1000;
	int max = 1;
	int add = 0;
	int add1 = 0;
	int a = 0;
	int sum = 0;
	while (true) {
		int y = rand.nextInt(999)+1;
		x[0+add] = y;
		sum = sum +y;
		System.out.println(x[add]);
		add = add+1;
		if (add == 1000) {
			break;
		}
	}
	while (a<x.length) {
		if (x[a]<min) {
			min = x[a];
		}
		a = a + 1;
	}
	a = 0;
	while (a<x.length) {
		if (x[a]>max) {
			max = x[a];
		}
		a = a + 1;
	}
	int avg = (sum/add);
	System.out.println("This is a marker!");
	System.out.println(avg);
	System.out.println(max);
	System.out.println(min);
	}
}
