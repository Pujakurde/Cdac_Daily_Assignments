#include "Date.h"

Date::Date()
{
	cout << "The Default constructor: \n";
	day = 0;
	mon = 0;
	year = 0;
}
Date::Date(int d,int mn,int y)
{
	cout << "The Parameterised constructor: \n";
	day = d;
	mon = mn;
	year = y;
}
Date::Date(const Date &obj)
{
	cout << "The Copy constructor: \n";
	day = obj.day;
	mon = obj.mon;
	year = obj.year;
}
void Date::accept()
{
	cout << "Enter a day: ";
	cin >> day;
	cout << "Enter a month: ";
	cin >> mon;
	cout << "Enter a year: ";
	cin >> year;
}
void Date::ShowDate()
{
	cout << "The  Date: " << day << "/" << mon << "/" << year << "\n";
}
