class starter {
	public static void main(String args[]) {
		// (0°C × 9/5) + 32 = 32°F - formula for convertion (the '0' would be replaced 
		// with whatever celsuis value you choose)
	int fahr = 10;
	double cel=32;
	int equation= (fahr-32*5/9);
	String A= new String("The correct conversion would be " + equation + " degrees celsius");
	System.out.println(A);
	}
}
