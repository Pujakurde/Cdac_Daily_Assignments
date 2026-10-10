#pragma once
#include <iostream>
#include <cstring>
#define CRT_SECURE_NO_WARNINGS
using namespace std;
class Student
{
private:
	int roll_no;
	char name[20];
	float marks;

public:
	Student();
	Student(int roll, const char studentName[], float studentMarks);
	void accept();
	void displaydetails() const;
	char calculateGrade() const;
};