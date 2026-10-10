#include "SalesEmployee.h"

void SalesEmployee::accept()
{
    WageEmployee::accept();

    cout << "Enter No. of Items Sold: ";
    cin >> noOfItemsSold;

    cout << "Enter Commission Per Item: ";
    cin >> commissionPerItem;
}

void SalesEmployee::display()
{
    WageEmployee::display();

    cout << "\nNo. of Items Sold: " << noOfItemsSold;
    cout << "\nCommission Per Item: " << commissionPerItem;
}