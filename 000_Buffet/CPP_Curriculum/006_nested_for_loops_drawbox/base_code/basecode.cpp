// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char a;
	int b;
	int c;
	int x = 1;
	int y = 5;
	int i;
	cout << "What symbol do you wish to print?: ";
	cin >> a;
	cout << "How many rows should this symbol be printed? (to make a box): ";
	cin >> b;
	cout << "How long should the rows be? (1-10): ";
	cin >> c;
	i; 
	while ( b>0) {
		for(i = 0; i < c; i++) {
			cout << a;
			
			
	}
	cout << "\n";
	b = b-1;
	}
}
