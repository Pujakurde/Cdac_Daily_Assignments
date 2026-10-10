#pragma once
#include <iostream>
using namespace std;

class Date
{
private:
	int day, mon, year;
public:
	Date();
	Date(int d, int mn, int y);
	Date(const Date &obj);

	void accept();
	void ShowDate();
};
