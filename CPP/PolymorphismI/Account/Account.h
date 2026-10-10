#pragma once
#include <iostream>
using namespace std;
class Account
{
protected:
	int accNo;
	char name[20];
	double balance;

public:
	Account();
	Account(int accNo, const char* name, double balance);
	virtual void display();
	virtual double calnetBalance() = 0;
};
