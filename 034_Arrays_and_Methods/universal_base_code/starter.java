import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	static int sum = 0;
	public static void toStringArray(int[]x,int add) {
		Random rand = new Random(); 
		while (true) {
		int y = rand.nextInt(99)+1;
		x[0+add] = y;
		sum = sum +y;
		System.out.println(x[0+add]);
		add = add+1;
		if (add == 100) {
			break;
		}
	}
	}
	public static int getArrayAverage(int[]x, int add) {
	sum = (sum/add);
	System.out.println(sum);
	return(sum);
	}
	public static int getArrayMax(int[]x, int a, int max) {
	while (a<x.length) {
		if (x[a]>max) {
			max = x[a];
		}
		a = a + 1;
	}
	a = 1;
	System.out.println(max);
	return(max);
	}
	
	public static int getArrayMin(int[]x, int a, int min) {
	Random rand = new Random();
		x[0] = rand.nextInt(99)+1;
		while (a<x.length) {
		if (x[a]<min) {
			min = x[a];
		}
		a = a + 1;
	}
	System.out.println(min);
	return(min);
	}
	
	public static void main(String args[]) {
	Random rand = new Random();
	int [] x = new int [100];
	int add = 1;
	int max = 1;
	int min = 1000;
	int a = 0;
	toStringArray(x,add);
	System.out.println("This is a marker!");
	getArrayAverage(x,add);
	getArrayMax(x,a,max);
	getArrayMin(x,a,min);


		
	}
}
