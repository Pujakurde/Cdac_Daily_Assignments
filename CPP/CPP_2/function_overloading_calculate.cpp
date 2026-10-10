#include<iostream>
using namespace std;
int calculate(int a,int b)
{
   return a+b;
}
double calculate(double r,double s)
{
   return r+s;
}
int calculate(int a,int b,int c)
{
   return a*b*c;
}


int main()
{  
   int z,y,x;
   z=calculate(10,20); //2 integer
   cout<<"\nTwo Integer addition: "<<z;
   y=calculate(135885,1358867); // 2 double
   cout<<"\nTwo Double addition: "<<y;
   x=calculate(13,12,15); // 3 int
   cout<<"\nThree integer multiplication: "<<x;
   return 0;
}