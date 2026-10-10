#include "Book.h"
#include <cstring>

int Book::bookid = 0;

Book::Book()
{
	cout << "\nDefault constructor called...";
	bookid++;
	name[0] = '\0';
	author[0] = '\0';
	price = 0.0f;
}

Book::Book(int bi, const char nm[], const char at[], float p)
{
	cout << "\nParameterized constructor called...";
	bookid = bi;
	// Leave room for the terminating null character when copying user text.
	strncpy(name, nm, sizeof(name) - 1);
	name[sizeof(name) - 1] = '\0';
	strncpy(author, at, sizeof(author) - 1);
	author[sizeof(author) - 1] = '\0';
	price = p;
}


void Book::accept()
{
	cout << "\nEnter Book id: ";
	cin >> bookid;
	cout << "\nEnter Name: ";
	cin >> setw(sizeof(name)) >> name;
	cout << "\nEnter Author Name: ";
	cin >> setw(sizeof(author)) >> author;
	cout << "\nEnter Price: ";
	cin >> price;
}

void Book::display()
{
	cout << "\nBook ID: " << bookid;
	cout << "\nName: " << name;
	cout << "\nAuthor Name: " << author;
	cout << "\nPrice: " << price << endl;
}


