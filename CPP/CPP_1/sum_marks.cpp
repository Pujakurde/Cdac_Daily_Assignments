#include<iostream>
#include <iostream>
using namespace std;
int main(){
    float s1,s2,s3,s4,s5,sum,avg;
    cout << "Enter the Marks of subject 1 ";
    cin >> s1;
    cout << "Enter the Marks of subject 2 ";
    cin>>s2;
    cout << "Enter the Marks of subject 3 ";
    cin>>s3;
    cout << "Enter the Marks of subject 4 ";
    cin>>s4;
    cout << "Enter the Marks of subject 5 ";
    cin>>s5;
    sum=s1+s2+s3+s4+s5;
    cout<<"The sum is "<<sum;
    avg=sum/5;
    cout<<"\nThe average is :"<<sum/5;
    return 0;
}