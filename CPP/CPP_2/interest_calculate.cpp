#include <iostream>
using namespace std;
float calculateInterest(float principal, float rate=5.0, int time=2)
{
	return (principal * rate * time) / 100;
}
int main()
{
	float principal, rate, time;
	cout << "Enter the principal amount: ";
	cin >> principal;
	cout << "Enter the rate of interest: ";
	cin >> rate;
	cout << "Enter the time period: ";
	cin >> time;
	float interest = calculateInterest(principal, rate, time);
	cout << "The simple interest is: " << interest << endl;
	return 0;
}

	}
	return 0;
}
