//definition file
#include"Date.h"


Date::Date()
{
	cout << "\nDefault Constrcutor called...";
	day = month = year = 0;
}

Date::Date(int day, int mm, int yy)
{
	cout << "\nParametrized constructor called...";
	this->day= day;
	month = mm;
	year = yy;
}

//:: scope resolution operator
//retur-type Class_name::method()
void Date::accept()
{
	cout << "\nEnter date:: ";
	cin >> day >> month >> year;
}

void Date::display()
{
	cout << "\nDate:: " << day << "/" << month << "/" << year;
}


