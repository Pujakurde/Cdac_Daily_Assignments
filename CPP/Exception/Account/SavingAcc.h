#pragma once
#include "Account.h"

class SavingAcc : public Account
{
private:
    double minBalance;

public:
    SavingAcc();
    SavingAcc(int acno, const char* acc, double balance, double minBalance);

    void withdraw(double amount) override;
    void display() override;
};