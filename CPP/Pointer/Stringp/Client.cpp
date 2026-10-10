#include "Stringp.h"

int main()
{
	cout << "Default Constructor: " << endl;
	Stringp s1;
	s1.display();

	cout << "Parametrized Constructor: " << endl;
	Stringp s2("KnowIT");
	s2.display();

	cout << "Copy Constructor: " << endl;
	Stringp s3(s2);
	s3.display();

	cout << "S5=S4=S3: " << endl;
	Stringp s4, s5;
	s5 = s4 = s3;
	s5.display();

	cout << "S6=S5+S7:" << endl;
	Stringp s7("Pune");
	Stringp s6 = s5 + s7;
	s6.display();

	Stringp s8('*', 10);
	s8.display();
}

