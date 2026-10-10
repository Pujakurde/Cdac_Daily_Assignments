#include<iostream>
using namespace std;


int main()
{  
   
   int num;
   cout<<"Enter the number: ";
   cin>>num;
   int f=0;
   bool isprime=true;

   if (num <= 1)
   {
      isprime = false;
   }
   else
   {
      for (int i = 2; i <= num / 2; i++)
      {
         if (num % i == 0)
         {
            isprime = false;
            f=0;
            break;
         }
         else{
            
            f=1;
         }
      }
   }

   if (f==1)
   {
      cout<<"Prime";
   }
   else
   {
      cout<<"Not prime";
   }
   return 0;
}