#include "Time1.h"
int main()
{
	Time1 t1(11,11,11);
	t1.display();
	Time1 t2(12,12,12);
	t2.display();
	Time1 t3;
	t3.display();

	cout << "\nAddition: ";
	t3 = t1 + t2;
	t3.display();

	cout << "\nSubtraction: ";
	t3 = t1 - t2;
	t3.display();

	cout << "\nMultiplication: ";
	t3 = t1 * t2;
	t3.display();
}