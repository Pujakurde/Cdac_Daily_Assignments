#pragma once
#include <iostream>
#include "Date.h"
using namespace std;

class Employee
{
private:
	
	int id;
	char name[20];
	Date birth_date;
public:
	Employee() = default;
	Employee(int, const char*, int, int, int);

	void accept();
	void display();
};
