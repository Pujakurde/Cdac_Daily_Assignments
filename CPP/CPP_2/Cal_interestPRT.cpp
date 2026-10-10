#include <iostream>
using namespace std;

// Primary implementation (3 arguments)
float calculateInterest(float principal, float rate, int time)
{
	return (principal * rate * time) / 100;
}

// Overloads to allow calling with different argument combinations
float calculateInterest(float principal) // uses default rate=5.0, time=2
{
	return calculateInterest(principal, 5.0f, 2);
}

float calculateInterest(float principal, float rate) // uses default time=2
{
	return calculateInterest(principal, rate, 2);
}

float calculateInterest(float principal, int time) // uses default rate=5.0
{
	return calculateInterest(principal, 5.0f, time);
}

int main()
{
	float principal, rate;
	int time;
	cout << "Enter the principal amount: ";
	cin >> principal;
	cout << "Enter the rate of interest: ";
	cin >> rate;
	cout << "Enter the time period (integer): ";
	cin >> time;

	// Test all overload combinations
	float interest_default = calculateInterest(principal);                 // 1-arg
	float interest_rate = calculateInterest(principal, rate);              // 2-arg (principal, rate)
	float interest_time = calculateInterest(principal, time);              // 2-arg (principal, time)
	float interest_all = calculateInterest(principal, rate, time);        // 3-arg

	cout << "\nResults for principal=" << principal << ", rate=" << rate << ", time=" << time << endl;
	cout << "calculateInterest(principal) = " << interest_default << endl;
	cout << "calculateInterest(principal, rate) = " << interest_rate << endl;
	cout << "calculateInterest(principal, time) = " << interest_time << endl;
	cout << "calculateInterest(principal, rate, time) = " << interest_all << endl;

	return 0;
}

