#include "SavingAcc.h"

SavingAcc::SavingAcc()
    : Account(), minBalance(0.0)
{
}

SavingAcc::SavingAcc(int acno, const char* acc, double balance,
    double minBalance)
    : Account(acno, acc, balance), minBalance(minBalance)
{
}

void SavingAcc::withdraw(double amount)
{
    try
    {
        if (amount <= 0)
        {
            throw amount;
        }

        // Saving-account-specific validation
        // can be added here when balance access is provided
        Account::withdraw(amount);
    }
    catch (double)
    {
        cout << "Invalid withdrawal amount." << endl;
    }
}

void SavingAcc::display()
{
    Account::display();

    cout << "Minimum Balance: " << minBalance << endl;
}