#include <iostream>
using namespace std;
inline int square(int n)
{
	return n * n;
}
int main()
{
	int n,x;
	cout<<"Enter the number till the square range : ";
	cin>>n;
	for(int i=0;i<=n;i++)
	{
		;
		cout<<"The square of "<< i<<" is: "<<square(i)<<endl; // call it till n
	}
	return 0;
}
