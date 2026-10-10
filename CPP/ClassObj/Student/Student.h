#pragma once
#include <iostream>
#include <cstring>
using namespace std;

class Student
{
private:
	int rollNo;
	char name1[30];
	float marks;

public:
	Student()=default;
	Student(int, const char[], float);

	void accept();
	void display();
	char calculateGrade() const;
};