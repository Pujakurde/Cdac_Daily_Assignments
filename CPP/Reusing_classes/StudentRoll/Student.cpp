#include "Student.h"
#include <iostream>

Student::Student()
	: rollNo(0), name(), birth_Date()
{
}

Student::Student(int r, const string& n, int d, int m, int y)
	: rollNo(r), name(n), birth_Date(d, m, y)
{
}

Student::Student(int r, const string& n, const Date& bd)
	: rollNo(r), name(n), birth_Date(bd)
{
}

void Student::acceptStudent()
{
	cout << "Enter Roll No: ";
	cin >> rollNo;
	cout << "Enter Name: ";
	cin >> name;
	cout << "Enter Birth Date:\n";
	birth_Date.acceptDate();
}

void Student::displayStudent()
{
	cout << "Roll No: " << rollNo << endl;
	cout << "Name: " << name << endl;
	birth_Date.displayDate();
}

	
