#pragma once
#include <iostream>
using namespace std;

class Date
{
private:
	int day , month ,year = 0;
public:
	Date() = default;
	Date(int d, int m, int y);
	void acceptDate();
	void displayDate();
};