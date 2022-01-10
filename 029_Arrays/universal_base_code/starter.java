import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		int add = 0;
		int add1 = 9;
		int [] x = new int [10];
		for (int i=0;i<10;i++) {
			x [0+add] = add1;
			add=add+1;
			add1 = add1-1;
		}
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println(x[2]);
		System.out.println(x[3]);
		System.out.println(x[4]);
		System.out.println(x[5]);
		System.out.println(x[6]);
		System.out.println(x[7]);
		System.out.println(x[8]);
		System.out.println(x[9]);


		
	}
}
