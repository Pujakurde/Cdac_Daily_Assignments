#pragma once

#include "Employee.h"

class DevEmployee : public Employee
{
private:
    float salary;

public:
    void accept() override;
    void display() override;
    void calSalary() override;
};