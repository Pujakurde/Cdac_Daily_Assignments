#include "Stringp.h"
//#include <cstring>

Stringp::Stringp()
{
	length = 0;
	sptr = new char[1];
	*sptr = '\0';
}

Stringp Stringp::operator+(Stringp& obj)
{
	Stringp temp;
	temp.length = this->length + obj.length;
	temp.sptr = new char[temp.length + 1];
	strcpy_s(temp.sptr, temp.length + 1, this->sptr);
	strcat_s(temp.sptr, temp.length + 1, obj.sptr);
	return temp;
}

Stringp::Stringp(int len, char c)
{
	length = len;
	sptr = new char[length + 1];
	for (int i = 0; i < length; ++i) sptr[i] = c;
	sptr[length] = '\0';
}

Stringp::Stringp(char c, int len)
{
	length = len;
	sptr = new char[length + 1];
	for (int i = 0; i < length; ++i) sptr[i] = c;
	sptr[length] = '\0';
}

Stringp::Stringp(const char* str) {
    if (!str) {
        length = 0;
        sptr = new char[1];
        sptr[0] = '\0';
        return;
    }
    length = static_cast<int>(strlen(str));
    sptr = new char[length + 1];
    strcpy_s(sptr, length + 1, str);
}
Stringp::Stringp(const Stringp& str)
{
	cout << "\n\tCopy constructor invoked...";
	this->length = str.length;
	this->sptr = new char[length + 1];
	strcpy_s(this->sptr, length + 1, str.sptr);
}

void Stringp::display()
{
	cout << "\nString:: " << sptr;
}

Stringp& Stringp::operator=(Stringp& obj)
{
	if (this == &obj) return *this;
	if (this->sptr != NULL) {
		delete[] sptr;
		sptr = NULL;
	}
	this->length = obj.length;
	this->sptr = new char[length + 1];
	strcpy_s(this->sptr, length + 1, obj.sptr);
	return *this;
}

Stringp::~Stringp()
{
	if (sptr != NULL)
	{
		cout << "\n\tDestructor invoked for " << sptr;
		delete[]sptr;
		sptr = NULL;
	}
}
