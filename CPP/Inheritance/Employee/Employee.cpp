 #include "Employee.h"
Employee::Employee(int emp_id, const char nm[], int d, int m, int y)
    : birth_date(d, m, y)
{
    cout << "\nEmployee Parameterized invokedd...";
    id = emp_id;
    strcpy_s(name,20, nm);
}
void Employee::accept()
{
    cout << "Enter Employee ID: ";
    cin >> id;

    cout << "Enter Employee Name: ";
    cin >> name;
}

void Employee::display()
{
    cout << "\nEmployee ID: " << id;
    cout << "\nEmployee Name: " << name;
    birth_date.display();
}

void Employee::calSalary()
{
    cout << "The calculate salary calculating......."<<endl;
}


