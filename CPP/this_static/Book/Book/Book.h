#pragma once
#include <iomanip>
#include <iostream>
using namespace std;

class Book
{
private:
	// The exercise keeps one shared book ID for every Book object.
	static int bookid;
	char author[20];
	char name[20];
	float price;
public:
	Book();  //default constructor
	Book(int, const char[], const char[], float);

	void accept();
	void display();
};
