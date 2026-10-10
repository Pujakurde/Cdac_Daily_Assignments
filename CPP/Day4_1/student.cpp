#include "Student.h"

Student::Student() : roll_no(0), marks(0.0f)
{   
	name[0] = '\0';
	cout << "\nDefault constructor called...";
}

Student::Student(int roll, const char studentName[], float studentMarks)
	: roll_no(roll), marks(studentMarks)
{
	strncpy(name, studentName, sizeof(name) - 1);
	name[sizeof(name) - 1] = '\0';
	cout << "\nParameterized constructor called...";
}

void Student::accept()
{
	cout << "\nEnter roll number: ";
	cin >> roll_no;
	cout << "\nEnter name: " ;
	cin >>  name;
	cout << "\nEnter roll number;, name, and marks: ";
	cin >>marks;
}

void Student::displaydetails() const
{
	cout << "\nRoll No: " << roll_no
		<< "\nName: " << name
		<< "\nMarks: " << marks
		<< "\nGrade: " << calculateGrade() << '\n';
}

char Student::calculateGrade() const
{
	if (marks >= 90)
	{
		return 'A';
	}
	else if (marks >= 75)
	{
		return 'B';
	}
	else if (marks >= 60)
	{
		return 'C';
	}
	else if (marks >= 40)
	{
		return 'D';
	}
	else
	{
		return 'F';
	}
}
