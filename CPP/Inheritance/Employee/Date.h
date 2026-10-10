#pragma once
#include <iostream>
using namespace std;

class Date
{
private:
	int day = 0, month = 0, year = 0;
public:
	Date() = default;
	Date(int, int, int);

	void display();
};
