// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char a;
	int b;
	string c;
	int d = 1;
	int e = 5;
	int i;
	cout << "What symbol do you wish to print?: ";
	cin >> a;
	cout << "How many times should this symbol be printed?: ";
	cin >> b;
	cout << "Which direction should the line go: horizontal, vertical, or diagonal(h,v,d)?: ";
	cin >> c;
	if (c == ("d")) {
	for(i = 0; i < b; i++) {
		gotoxy(d,e);
		cout << a;
		d = d+1;
		e = e+1;
	}
	}
	if (c == ("h")) {
	for (i = 0;i < b; i++) {
		cout << a;	
		}
	}
	if (c == ("v")) {
	for (i = 0;i < b; i++) {
		gotoxy(d,e);
		cout <<a;
		e = e+1;
	}
	}
}