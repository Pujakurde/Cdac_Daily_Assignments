#pragma once
#include <iostream>
using namespace std;

class Employee_Exception
{
private:
	int id;
	char Ename[20];
	float salary;
public:
	Employee_Exception();
	Employee_Exception(int id, const char* Ename, float salary);

	bool accept();
	void display();
	
};

