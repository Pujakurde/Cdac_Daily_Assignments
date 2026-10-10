#include"Complex.h"

int main()
{
	Complex c1(0,0);
	c1.display();

	Complex c2(2, 3);
	//c2.display();

	Complex c3(3, 4);
	//c3.display();

	Complex c4();
	//c4.display();

	cout << "\nUnary";
	c3 = +c2;
	cout << "\nBefore:";
	c3.display();
	cout << "\nAfter:";
	c2.display();
	
	cout << "\nBinary";
	c4 = c3+c2;
	cout << "\nBefore:";
	c4.display();
	cout << "\nAfter:";
	c4.display();

	
	return 0;
}