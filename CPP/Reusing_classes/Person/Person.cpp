#include "Person.h"

Person::Person(int a, const char* n, Date d, Address ad)
{
	age = a;
	if (n) {
		strncpy_s(name, sizeof(name), n, sizeof(name) - 1);
		name[sizeof(name) - 1] = '\0';
	} else {
		name[0] = '\0';
	}
	birth_date = d;
	address = ad;
}
void Person::acceptPerson()
{
	cout << "Enter name: ";
	cin >> name;
	cout << "Enter age: ";
	cin >> age;
	birth_date.acceptDate();
	address.acceptAddress();
}
void Person::displayPerson()
{
	cout << "Name: " << name << endl;
	cout << "Age: " << age << endl;
	birth_date.displayDate();
	address.displayAddress();
}

