#include "Address.h"

Address::Address()
{
	city[0] = '\0';
	pincode = 0;
}

Address::Address(const char* c, int p)
{
	if (c) {
		strncpy_s(city, sizeof(city),c, sizeof(city) - 1);
		city[sizeof(city) - 1] = '\0';
	} else {
		city[0] = '\0';
	}
	pincode = p;
}
void Address::acceptAddress()
{
	cout << "Enter city: ";
	cin >> city;
	cout << "Enter pincode: ";
	cin >> pincode;
}
void Address::displayAddress()
{
	cout << "City: " << city << endl;
	cout << "Pincode: " << pincode << endl;
}
