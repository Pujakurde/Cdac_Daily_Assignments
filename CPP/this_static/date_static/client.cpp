#include"Date.h"

int main()
{
	Date d1;
	//d1.accept();
	d1.display();

	Date d2(27,8,2026);
	//d2.accept();
	d2.display();

	Date d3;
	Date d4;
	int icountofObjects = Date::getCount();
	
	return 0;
}