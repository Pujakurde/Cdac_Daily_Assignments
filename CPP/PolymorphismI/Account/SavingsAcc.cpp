#include "SavingsAcc.h"

double SavingsAcc::rate = 4.5;
SavingsAcc::SavingsAcc() : Account()
{

}

SavingsAcc::SavingsAcc(int accNo, const char* name, double balance) : Account(accNo, name, balance)
{


}

double SavingsAcc::calnetBalance()
{
	return balance + (balance * rate / 100);
}
void SavingsAcc::display()
{
	Account::display();
	cout << "Rate of interest: " << rate << endl;
	cout << "Net balance: " << calnetBalance() << endl;
}
void SavingsAcc::setRate(double r)
{
	rate = r;
}
double SavingsAcc::getintRate()
{
	return rate;
}
double SavingsAcc::calinterest()
{
	return balance * rate / 100;
}
double SavingsAcc::getinamt()
{

	return calinterest();
}