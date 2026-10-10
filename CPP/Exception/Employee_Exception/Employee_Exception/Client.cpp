#include"Employee_Exception.h"

int main()
{
	Employee_Exception emp1(0, "", 0.0f);
	emp1.accept();
	emp1.display();

	Employee_Exception emp2;
	emp2.accept();
	emp2.display();
	return 0;
}