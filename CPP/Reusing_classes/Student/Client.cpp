#include "Student.h"

int main()
{
	Student s1(101, "John", 15, 8, 2000);
	Student s2(102, "Alice", Date(20, 12, 1999));
	cout << "Student 1 Details:" << endl;
	s1.displayStudent();
	cout << "\nStudent 2 Details:" << endl;
	s2.displayStudent();
	Student s3;
	s3.acceptStudent();
	s3.displayStudent();
	return 0;
}