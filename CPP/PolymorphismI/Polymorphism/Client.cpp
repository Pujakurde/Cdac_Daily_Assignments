#include "DevEmployee.h"
#include "Employee.h"

int main()
{
    Employee* ptr;

    DevEmployee d;

    ptr = &d;

    ptr->accept();
    ptr->display();
    ptr->calSalary();

    return 0;
}