#pragma once
#pragma once
#include "Employee.h"

class DevEmployee : public Employee
{
private:
    int experience;
    float salary;

public:
    void accept();
    void display();

};