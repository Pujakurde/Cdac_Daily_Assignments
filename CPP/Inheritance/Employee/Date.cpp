#include"Date.h"

Date::Date(int d, int m, int y)
{
	cout << "\nDate parametrized invoked";
	day = d;
	month = m;
	year = y;
}

void Date::display()
{
	cout << "\nDate: " << day << "/" << month << "/" << year;
}