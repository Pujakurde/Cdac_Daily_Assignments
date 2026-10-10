#pragma once
#include <iostream>
#include <cstring>

using namespace std;

class Employee
{
protected:
    int empId;
    char name[20];

public:
    Employee();

    Employee(int id, const char* nm);

    virtual void accept();
    virtual void display();
    virtual void calSalary() = 0;

    virtual ~Employee();
};

