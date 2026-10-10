#include "Employee.h"

Employee::Employee()
{
    empId = 0;
    strcpy_s(name, 20, "");
}

Employee::Employee(int id, const char* nm)
{
    empId = id;
    strcpy_s(name, 20, nm);
}

void Employee::accept()
{
    cout << "Enter Employee Id : ";
    cin >> empId;

    cout << "Enter Employee Name : ";
    cin >> name;
}

void Employee::display()
{
    cout << "\nEmployee Id : " << empId;
    cout << "\nEmployee Name : " << name;
}

Employee::~Employee()
{
}