#include<iostream>
#include<fstream>
using namespace std;

int main()
{
	ofstream out;
	out.open("char.txt"); // if not present, it will create a new file

	out.put('A');
	out.put('B');
	out.put('C');

	out.close();

	ifstream in("char.txt");
	if (in.fail())
	{
		cout << "\nFile not found...";
		exit(0);
	}
	char ch;
	do {
		ch = in.get();
		cout << "\n" << ch;
	} while (!in.eof());
	return 0;
}