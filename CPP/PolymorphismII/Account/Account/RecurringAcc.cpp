#include "RecurringAcc.h"

double RecurringAcc::rate = 7.5;
RecurringAcc::RecurringAcc() : Account()
{
	inamt = 0;
	noin= 0;
}
RecurringAcc::RecurringAcc(int accNo, const char* name, double balance) : Account(accNo, name, balance)
{
}
RecurringAcc::RecurringAcc(int accNo, const char* name, double balance, double inamt,int noin): Account(accNo, name, balance)
{
	this->inamt = inamt;
	this->noin = noin;
}

double RecurringAcc::calnetBalance()
{
	return balance + (balance * rate / 100);
}
void RecurringAcc::display()
{
	Account::display();
	cout << "Installment Amount: " << inamt << endl;
	cout << "Number of Installments: " << noin << endl;
	cout << "Rate of interest: " << rate << endl;
	cout << "Net balance: " << calnetBalance() << endl;
}
void RecurringAcc::setRate(double r)
{
	rate = r;
}
double RecurringAcc::getintRate()
{
	return rate;
}
