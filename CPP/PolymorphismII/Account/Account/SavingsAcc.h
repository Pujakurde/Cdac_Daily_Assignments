#pragma once
#include "Account.h"
class SavingsAcc : public Account
{
private:
	static double rate;

public:
	SavingsAcc();
	SavingsAcc(int accNo, const char* name, double balance);
	void display() override;
	double calnetBalance() override;

	static void setRate(double r);
	static double getintRate();
	static double getinamt();
};
