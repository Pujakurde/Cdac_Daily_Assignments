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
	double calinterest();
	static double getintRate();
	double getinamt();

	static void setRate(double r);

};
