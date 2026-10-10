#include"Student.h"

Student::Student(int roll,
	const char studentName[],
	float studentMarks)
	: rollNo(roll), marks(studentMarks)
{
	strncpy(name1, studentName, sizeof(name1) - 1);
	name1[sizeof(name1) - 1] = '\0';
	cout << "\nParameterized constructor called...";
}
void Student ::accept()
{
	cout << "\nEnter roll number: ";
	cin >> rollNo;
	cout << "\nEnter name: ";
	cin >> name1;
	cout << "\nEnter marks: ";
	cin >> marks;

}
void Student::display()
{
	cout << "\nRoll No: " << rollNo << endl;
	cout << "\nName: " << name1<<endl;
	cout << "\nMarks: " << marks<<endl;
	cout<< "\nGrade: " << calculateGrade() << '\n';
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