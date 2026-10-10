#include "DevEmployee.h"

void DevEmployee::accept()
{
    Employee::accept();

    cout << "Enter Salary : ";
    cin >> salary;
}

void DevEmployee::display()
{
    Employee::display();

    cout << "\nSalary : " << salary;
}

void DevEmployee::calSalary()
{
    cout << "\nDeveloper Salary : " << salary;
}