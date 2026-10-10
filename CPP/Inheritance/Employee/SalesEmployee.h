#pragma once
#include "WageEmployee.h"

class SalesEmployee : public WageEmployee
{
private:
    int noOfItemsSold;
    float commissionPerItem;

public:
    void accept();
    void display();
};