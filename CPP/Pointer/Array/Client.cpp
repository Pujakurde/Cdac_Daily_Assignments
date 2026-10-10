#include "Array.h"
int main()
{
    Array a1;        // default constructor
    a1.display();
    Array a2(3);     // parameterized constructor
    a2.display();
    Array a3(a1);    // copy constructor
    a3.display();
    Array a4(a2);    // copy constructor
    a4.display();
  
    return 0;
}
