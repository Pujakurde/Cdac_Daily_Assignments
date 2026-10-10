#include "Account.h"
#include "RecurringAcc.h"
#include "SavingsAcc.h"

#include <iostream>
using namespace std;

int main()
{
	SavingsAcc sv(101, "Puja", 10000);
	RecurringAcc rc(102, "John", 5000, 1000, 5);

	Account* ptr[3];

	ptr[0] = &sv;
	ptr[1] = &rc;
	ptr[2] = ;

	cout << "---Saving Account---" << endl;
	ptr[0]->display();

	cout << "---Recurring Account---" << endl;
	ptr[1]->display();

	cout << "Changing Saving Account Interest Rate: " << endl;
	SavingsAcc::setRate(5.0);

	cout << "New Saving Interest Rate: " << SavingsAcc::getintRate() << "%" << endl;

	cout << "Changing Saving account rate: " << ptr[0]->calnetBalance() << endl;

	cout << "New Recurring interest rate: " << RecurringAcc::getintRate() << "%" << endl;

	cout << "Changing Recurring account rate: " << ptr[1]->calnetBalance() << endl;
}