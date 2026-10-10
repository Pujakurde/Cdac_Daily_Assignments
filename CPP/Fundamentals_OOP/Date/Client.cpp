
#include "Date.h"

int main()
{
	Date d1;
	d1.ShowDate();
	Date d2;
	d2.accept();
	d2.ShowDate();
	Date d3(d2);
	d3.ShowDate();


}