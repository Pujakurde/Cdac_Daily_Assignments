 #include <iostream>
using namespace std;

int findMax(int a, int b)
{
	if (a > b)
	{
		return a;
	}
	else
	{
		return b;
	}
}

double findMax(double a, double b)
{
	if (a > b)
	{
		return a;
	}
	else
	{
		return b;
	}
}

int findMax(int a, int b, int c)
{
	if (a > b && a > c)
	{
		return a;
	}
	else if (b > c)
	{
		return b;
	}
	else
	{
		return c;
	}
}

int main()
{
	cout << "Max: " << findMax(10, 20) << '\n';
	cout << "Max: " << findMax(135885.0, 1358867.0) << '\n';
	cout << "Max: " << findMax(13, 12, 15) << '\n';
	return 0;
}
