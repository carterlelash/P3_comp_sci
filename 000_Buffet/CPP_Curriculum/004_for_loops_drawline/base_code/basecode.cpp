// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	char a;
	int b;
	cout << "What symbol do you wish to print?: ";
	cin >> a;
	cout << "How many times should this symbol be printed?: ";
	cin >> b;
	for(b = 0;b <5;b++) {
		cout << a;
	}

}
