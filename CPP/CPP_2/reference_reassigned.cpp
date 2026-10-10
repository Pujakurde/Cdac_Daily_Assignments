 #include <iostream>
using namespace std;

int main()
{
	int a = 3;
	int &ref=a;
	cout <<"Unmodified Value of a: "<< a<< endl;
	cout<<"Value of reference: "<<ref<<end;
	ref=10;
	cout <<"Modified Value of a: "<< a<< endl;

	return 0;
}
