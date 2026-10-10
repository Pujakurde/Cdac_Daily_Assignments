#include "SavingAcc.h"

int main()
{
    SavingAcc s1(101, "Saving", 10000, 1000);

    s1.display();

    cout << "\n--- Deposit ---" << endl;
    s1.deposit(2000);

    cout << "\n--- Withdraw ---" << endl;
    s1.withdraw(3000);

    cout << "\n--- Final Details ---" << endl;
    s1.display();

    return 0;
}