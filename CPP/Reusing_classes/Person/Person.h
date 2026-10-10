#pragma once
#include <iostream>
#include <cstring>
#include "Date.h"
#include "Address.h"
using namespace std;

class Person
{
private:
	int age;
	char name[100];
	Date birth_date;
	Address address;
public:
	Person() = default;
	Person(int a, const char* n, Date d, Address ad);
	void acceptPerson();
	void displayPerson();
};
