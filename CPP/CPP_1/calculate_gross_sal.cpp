#include<iostream>
using namespace std;

int main()
{
    float base_sal,hra,da,pf,gross_sal;
    cout<<"Enter your Salary: ";
    cin>>base_sal;

    hra=0.15*base_sal;
    da=0.3*base_sal;
    gross_sal=base_sal+hra+da;
    pf=0.0125*gross_sal;
    cout<<"\nHRA: "<<hra;
    cout<<"\nDA: "<<da;
    cout<<"\nGross Salary: "<<gross_sal;
    cout<<"\nPF: "<<pf;
    return 0;
}