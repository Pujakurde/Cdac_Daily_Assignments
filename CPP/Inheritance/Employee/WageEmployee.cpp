#include "WageEmployee.h"

void WageEmployee::accept()
{
    Employee::accept();

    cout << "Enter No. of Hours Worked: ";
    cin >> noOfHoursWorked;

    cout << "Enter Rate Per Hour: ";
    cin >> ratePerHour;
}

void WageEmployee::display()
{
    Employee::display();

    cout << "\nNo. of Hours Worked: " << noOfHoursWorked;
    cout << "\nRate Per Hour: " << ratePerHour;
}