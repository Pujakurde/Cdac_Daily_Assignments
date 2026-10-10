#include "Date.h"

Date::Date(int d, int m, int y)
{
	day = d;
	month = m;
	year = y;
}

void Date::acceptDate()
{
	cout << "Enter day: ";
	cin >> day;
	cout << "Enter month: ";
	cin >> month;
	cout << "Enter year: ";
	cin >> year;
}

void Date::displayDate()
{
	cout << "Date: " << day << "/" << month << "/" << year << endl;
}
