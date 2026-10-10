#include "Complex.h"

int main()
{
	Complex c(0, 0);
	Complex c1;
	Complex c2(3, 4);
	Complex c3(5, 6);
	//c1.display();
	//c2.display();

	cout << "\nPre-Increment:: ";
	c1 = ++c2;
	c1.display();
	c2.display();

	cout << "\nPost-Increment:: ";
	c1 = c3++;
	c1.display();
	c3.display();
	
	cout << "\nUnary Minus:: ";
	c1 = -c2;
	c1.display();
	c2.display();

	return 0;
}