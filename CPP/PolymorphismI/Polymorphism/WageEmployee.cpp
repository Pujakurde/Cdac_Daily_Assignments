#include "WageEmployee.h"

void WageEmployee::accept() 
{
    Employee::accept();

    cout << "Enter Experience : ";
    cin >> experience;
    cout << "Enter Salary : ";
    cin >> salary;
}
void WageEmployee::display() 
{
    Employee::display();
    cout << "\nHours : " << experience;
    cout << "\nRate : " << salary;
    
}