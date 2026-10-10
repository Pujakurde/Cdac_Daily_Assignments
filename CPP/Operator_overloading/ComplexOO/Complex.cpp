#include"Complex.h"

Complex::Complex(int r, int img)
{
	real = r;
	imaginary = img;
}

//binary operator overloading::
//return-type class_name::function()
Complex Complex::operator+(Complex& obj)
{
	Complex temp;
	temp.real = this->real + obj.real;
	temp.imaginary = this->imaginary + obj.imaginary;

	return temp;
}

//unary operator
Complex Complex::operator+()
{
	Complex temp;

	temp.real = +this->real;
	temp.imaginary = +this->imaginary;

	return temp;
}

void Complex::display()
{
	cout << "\nComplex Number:: " << real << "" << imaginary << "i";
}
