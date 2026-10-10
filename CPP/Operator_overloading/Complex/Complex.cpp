#include "Complex.h"


Complex::Complex(int r, int i)
{
	real = r;
	img = i;
}

Complex Complex ::operator++()
{
	cout << "Pre increment operator called" << endl;
	++this->real;
	++this->img;
	return *this;
}

Complex Complex ::operator++(int n)
{
	cout << "Post increment operator called" << endl;
	this->real++;
	++this->img;
	return *this;
}
Complex Complex ::operator-()
{
	cout << "Unary minus operator called" << endl;
	this->real = -this->real;
	this->img = -this->img;
	return *this;
}

void Complex::display()
{
	cout << "Complex:" << real << "+" << img << "i" << endl;
}