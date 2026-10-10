#pragma once
#include "Account.h"
class RecurringAcc : public Account
{
private:
	static double rate;
	double inamt;
	int noin;
public:
	RecurringAcc();
	RecurringAcc(int accNo, const char* name, double balance);
	RecurringAcc(int accNo, const char* name, double balance, double inamt, int noin);
	void display() override;
	double calnetBalance() override;

	static void setRate(double r);
	static double getintRate();
};
