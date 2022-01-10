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
	int i;
	int count;
	cout << "What symbol do you wish to print?: ";
	cin >> a;
	cout << "How many rows should this symbol be printed? (to make a box): ";
	cin >> b;
	cout << "How long should the rows be? (1-10): ";
	cin >> c;
	cout << "Enter the x coordinate for the box: ";
	cin >> x;
	cout << "Enter the y coordinate for the box: ";
	cin >> y;
	gotoxy(x,y);
	for(i = 0; i < c; i++) {
		cout << a;
	}
	cout <<endl;
	for (i = 0; i < c; i++) {
		gotoxy(x + (b-1),y);
		cout <<a;
		y = y+1;
	}
	cout <<endl;
	y = y-b;
	for (i = 0; i < c; i++) {
		gotoxy(x,y);
		cout <<a;
		y = y+1;
	}
	cout <<endl;
	y = y - b;
	for (i = 0; i < c; i++) {
		gotoxy(x,y + (b-1));
		cout <<a;
		x = x+1;
	}
}