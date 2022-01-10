// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char a;
	int b;
	int c;
	int x = 0;
	int y = 0;
	int z = 0;
	int d;
	int e;
	int f;
	int g;
	double a1;
	double a2;
	int answer;
	char action;
	char act;
	
	cout << "Enter an integer: ";
	cin >> a1;
	cout << "Enter a second integer: ";
	cin >> a2;
	cout << "What action do you wish to perform? (A, S, M, D): ";
	cin >> action;
	if (action == ('a') || action == ('A')) {
		answer = a1+a2;
		act = '+';
	}
	if (action == ('s') || action == ('S')) {
		answer = a1-a2;
		act = '-';
	}
	if (action == ('m') || action == ('M')) {
		answer = a1*a2;
		act = '*';
	}
	if (action == ('d') || action == ('D')) {
		answer = a1/a2;
		act = '/';
	}
	cout << "What symbol do you wish to print?: ";
	cin >> a;
	cout << "What is the width of the box (20-30)?: ";
	cin >> b;
	cout << "What is the height of the box (5-10)?: ";
	cin >> c;
	cout << "Enter the x coordinate for the box: ";
	cin >> x;
	cout << "Enter the y coordinate for the box: ";
	cin >> y;
	cout << endl << endl << endl << endl;
	
	gotoxy(x,y);
	for(d = 1;d < b; d++) {
		cout << a;
	}
	gotoxy(x + (b-1),y);
	for (f = 0; f < c; f++) {
		cout <<a<<endl;
		y = y+1;
		gotoxy(x +(b-1),y);
	}
	cout <<endl;
	y = y-c;
	gotoxy(x,y);
	for (f = 0; f < c; f++) {
		cout <<a<<endl;
		y = y+1;
		gotoxy(x,y);
	}
	cout <<endl;
	gotoxy(x,y-1);
	for (g = 1;g < b; g++) {
		cout <<a;
	}
	y=y-c;
	gotoxy(x + (x/2),y + (y/2));
	cout << a1 << act << a2 <<" = "<< answer;
}
