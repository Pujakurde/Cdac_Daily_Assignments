#include<iostream>
using namespace std;
swapbyvalue(int a,int b)
{
    int temp;
    temp=a;
    a=b;
    b=temp;
    cout<<"\nThe swap by value : ";
}
swapbyreference(int &a,int &b)
{
    int temp;
    temp=a;
    a=b;
    b=temp;
    cout<<"\nThe swap by reference : ";

}
int main()
{
    int a =10,b=20;
    cout<<"Before swapping: "<<"a: "<<a<<" b: "<<b;
    swapbyvalue(a,b);
    cout<<"\nAfter Swapping by calling swap by value a: "<<a<<" b: "<<b;

    cout<<"\nBefore swapping: "<<"a: "<<a<<"b: "<<b;
    swapbyreference(a,b);
    cout<<"\nAfter Swapping by calling swap by refrence a: "<< a<<" b: "<<b;

    return 0;
}