#include "Account.h"

Account::Account()
{
    acno = 0;
    strcpy_s(AccType, sizeof(AccType), "");
    balance = 0.0;
}

Account::Account(int acno, const char* acc, double balance)
{
    this->acno = acno;
    strcpy_s(this->AccType, sizeof(this->AccType), acc);
    this->balance = balance;
}

void Account::deposit(double amount)
{
    try
    {
        if (amount <= 0)
        {
            throw amount;
        }

        balance += amount;
        cout << "Amount deposited successfully." << endl;
    }
    catch (double)
    {
        cout << "Invalid deposit amount." << endl;
    }
}

void Account::withdraw(double amount)
{
    try
    {
        if (amount <= 0)
        {
            throw amount;
        }

        if (amount > balance)
        {
            throw "Insufficient balance";
        }

        balance -= amount;
        cout << "Amount withdrawn successfully." << endl;
    }
    catch (double)
    {
        cout << "Invalid withdrawal amount." << endl;
    }
    catch (const char* msg)
    {
        cout << msg << endl;
    }
}

void Account::display()
{
    cout << "Account Number : " << acno << endl;
    cout << "Account Type   : " << AccType << endl;
    cout << "Balance        : " << balance << endl;
}