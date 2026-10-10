#pragma once
#include "Date.h"
#include <iostream>
#include <string>

using namespace std;

class Student
{
private:
	int rollNo;
	string name;
	Date birth_Date;
public:
	Student();
	Student(int r, const string& n, int d, int m, int y);
	Student(int r, const string& n, const Date& bd);
	void acceptStudent();
	void displayStudent();
};
