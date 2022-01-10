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
	int count;
	int count3;
	int count4;
	cout << "What symbol do you wish to print?: ";
	cin >> a;
	cout << "What is the width?: ";
	cin >> b;
	cout << "What is the height?: ";
	cin >> c;
	cout << "Enter the x coordinate for the box: ";
	cin >> x;
	cout << "Enter the y coordinate for the box: ";
	cin >> y;
	gotoxy(x,y);
	for(d = 0;d < b; d++) {
		cout << a;
	}
	gotoxy(x + (b-1),y);
	for (e = 0; e < c; e++) {
		cout <<a;
		y = y+1;
		gotoxy(x +(b-1),y);
	}
	cout <<endl;
	y = y-c;
	gotoxy(x,y);
	for (f = 0; f < c; f++) {
		cout <<a;
		y = y+1;
		gotoxy(x,y);
	}
	cout <<endl;
	gotoxy(x,y-1);
	for (g = 0;g < b; g++) {
		cout <<a;
	}
}
