#include "Student.h"
int main()
{
	Student s1;
	s1.accept();
	s1.displaydetails();

	Student s2(101, "Alice", 87.5f);
	s2.displaydetails();
	return 0;
}
