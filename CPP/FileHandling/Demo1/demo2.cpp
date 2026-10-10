#include <iostream>
#include<fstream>
using namespace std;

int main()
{
	ofstream out("names.txt");
	char str[20];

	if(out.fail())
	{ 
		cout << "\nFile not Found";
		exit(0);
	}
	int ans = 0;
	do
	{
		cout << "Enter name: ";
		cin >> str;
		out.write(str, 20);

		cout << "\nDo you want to continue(1/0):: ";
		cin >> ans;
	} while (ans != 0);
	out.close();

	
	ifstream in("names.txt");
	cout << "\nNames: ";

	while(!in.fail())
	{
		in.read(str, 20);
		if (!in.eof())
			break;	
		cout << "\n" << str;
		
	}
	in.close();
	return 0;

}
