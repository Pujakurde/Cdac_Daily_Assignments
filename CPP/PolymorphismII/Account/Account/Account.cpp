#include "Account.h"

Account::Account()
{
	accNo = 0;
	strcpy_s(name, 20, "");
	balance = 0.0;
}

Account::Account(int ano, const char* nm, double b)
{
	this->accNo = ano;
	strcpy_s(name, 20, nm);
	this->balance = b;
}


void Account::display()
{
	cout << "Account Number: " << accNo << endl;
	cout << "Account Holder Name: " << name << endl;
	cout << "Account Balance: " << balance << endl;
}
