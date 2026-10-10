#pragma once
#include <iostream>
using namespace std;

class  Complex
{
private:
	int real;
	int img;
public:
	Complex()=default;
	Complex(int r, int i);
	Complex operator++();  //pre-increment
	Complex operator++(int);  //post-increment
	Complex operator-();  //unary minus

	void display();
};