#pragma once
#include "Employee.h"

class WageEmployee : public Employee
{
protected:
    int noOfHoursWorked;
    float ratePerHour;

public:
    void accept();
    void display();
};
