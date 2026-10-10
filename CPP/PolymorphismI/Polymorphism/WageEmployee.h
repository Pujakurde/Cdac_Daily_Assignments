#pragma once

#include "Employee.h"

class WageEmployee : public Employee
{
private:
    int experience;
    float salary;
    int hrs;
    float rate; 

public:
    void accept() override;
    void display() override;
    void calSalary() override;
};