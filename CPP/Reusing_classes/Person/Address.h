#pragma once
#include <iostream>
#include <cstring>
using namespace std;
class Address
{
private:
	char city[100];
	int pincode;

public:
	Address();
	Address(const char* c, int p);
	void acceptAddress();
	void displayAddress();
};
