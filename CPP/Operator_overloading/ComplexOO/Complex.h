#pragma once
//class Complex
#include<iostream>
using namespace std;

class Complex
{
private:
	int real = 0, imaginary = 0;  //initializer list

public:
	//this provides implicit default constructor
	Complex() = default;
	Complex(int, int);

	//binary operator overloading
	Complex operator+(Complex&);

	//unary operator overaloading
	Complex operator+();


	void display();

};