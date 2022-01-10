#include "./hfiles/poole.h"
main(){
	srand(time(NULL));
	int x = 10;
	int y = 10;
	char a = ('#');
	int b = 15;
	int c = 10;
	int d;
	int f;
	int g;
	
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
	gotoxy(18,15);
	cout << random(10);
}
