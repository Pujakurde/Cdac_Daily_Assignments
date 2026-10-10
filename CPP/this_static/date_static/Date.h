#pragma once
//this header file(.h) containing class Date
//demo to use class Date
#include<iostream>
using namespace std;

class Date
{
//private:
	int day, month, year;
	static int count;
public:

	Date()
	{
		day = month = year = 0;]
		count++;
		this->day=12;
	}
	//static member function
	static int getCount()
	{
		return count; //as it is static function 
	}
	Date();  //default constructor
	Date(int,int,int);

	void accept();
	void display();
};

