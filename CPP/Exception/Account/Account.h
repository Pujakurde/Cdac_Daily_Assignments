#pragma once
#include <iostream>
#include <cstring>
using namespace std;

class Account
{
private:
    int acno;
    char AccType[20];
    double balance;

public:
    Account();
    Account(int acno, const char* acc, double balance);

    void deposit(double amount);
    virtual void withdraw(double amount);
    virtual void display();
};