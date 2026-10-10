#pragma once
#include <iostream>
#include <stdexcept>
using namespace std;
class Time1
{
private:
	int hh = 00, mm = 00, ss = 00;
	static Time1 fromTotalSeconds(long long totalSeconds);
public:
	Time1() = default;
	Time1(int, int, int);

	Time1 operator+(const Time1& obj) const;
	Time1 operator-(const Time1& obj) const;
	Time1 operator*(const Time1& obj) const;
	void display();
};
