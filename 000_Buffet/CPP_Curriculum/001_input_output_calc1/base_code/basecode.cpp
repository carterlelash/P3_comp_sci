// base code file
#include './hfiles/poole.h'

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	int x = 0;
	int y = 0;
	char z;
	cout << 'Enter a number: ';
	cin >> x;
	cout << 'Enter another number: ';
	cin >> y;
	cout << 'What operation do you wish to perform (Ex. A,S,M,D): ';
	cin >> z;
	int a1 = (x+y);
	int s2 = (x-y);
	int m3 = (x*y);
	int d4 = (x/y);
	if (z == ('a') || z == ('A')) {
		cout << x << '+' << y << '=' << a1;
	}
	if (z == ('s') || z == ('S')) {
		cout << x << '-' << y << '=' << s2;
	}
	if (z == ('m') || z == ('M')) {
		cout << x << '*' << y << '=' << m3;
	}
	if (z == ('d') || z == ('D')) {
		cout << x << '/' << y << '=' << d4;
	}
}