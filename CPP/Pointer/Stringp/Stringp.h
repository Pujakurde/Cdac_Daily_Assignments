#pragma once
#include <iostream>
using namespace std;

class Stringp
{
	int length;
	char* sptr;

public:
	Stringp();
	Stringp(int, char);
	Stringp(const Stringp& s);
	void display();
	Stringp(const char*);
	Stringp(char, int);
	Stringp& operator=(Stringp&);
	Stringp operator+(Stringp&);
	~Stringp();

};
