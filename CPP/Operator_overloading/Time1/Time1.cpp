#include "Time1.h"

Time1::Time1(int h, int m, int s)
{
	if (h < 0 || h >= 24 || m < 0 || m >= 60 || s < 0 || s >= 60)
		throw invalid_argument("Time must be in the form 0<=hh<24, 0<=mm<60, 0<=ss<60");

	hh = h;
	mm = m;
	ss = s;
}
Time1 Time1::fromTotalSeconds(long long totalSeconds)
{
	constexpr long long secondsPerDay = 24 * 60 * 60;
	totalSeconds %= secondsPerDay;
	if (totalSeconds < 0)
		totalSeconds += secondsPerDay;

	Time1 result;
	result.hh = static_cast<int>(totalSeconds / 3600);
	result.mm = static_cast<int>((totalSeconds % 3600) / 60);
	result.ss = static_cast<int>(totalSeconds % 60);
	return result;
}

Time1 Time1::operator+(const Time1& obj) const
{
	return fromTotalSeconds(
		static_cast<long long>(hh + obj.hh) * 3600 +
		static_cast<long long>(mm + obj.mm) * 60 + ss + obj.ss);
}

Time1 Time1::operator-(const Time1& obj) const
{
	return fromTotalSeconds(
		static_cast<long long>(hh - obj.hh) * 3600 +
		static_cast<long long>(mm - obj.mm) * 60 + ss - obj.ss);
}

Time1 Time1::operator*(const Time1& obj) const
{
	return fromTotalSeconds(
		static_cast<long long>(hh * obj.hh) * 3600 +
		static_cast<long long>(mm * obj.mm) * 60 + ss * obj.ss);
}

void Time1::display()
{
	cout << "\nTime: " << hh << ':' << mm << ':' << ss;
}
