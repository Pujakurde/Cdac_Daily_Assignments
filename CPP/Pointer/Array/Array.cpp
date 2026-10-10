#include "Array.h"

Array::Array() : size(5), arr(new int[size])
{
    arr(new int[size]);
    for (int i = 0; i < size; ++i)
    {
        arr[i] = 0;
    }
}

Array::Array(int s) : size(s), arr(new int[size])
{
    for (int i = 0; i < size; ++i)
    {
        arr[i] = i+1;
    }
}

Array::Array(const Array& obj) : size(obj.size), arr(new int[size])
{

    cout << "\nUser defined copy constructor";
    this->size = obj.size;
    this->arr = new int[size];
    for (int i = 0; i < size; ++i)
    {
        
        arr[i] = obj.arr[i];
    }
    
}
                    
Array::~Array()
{
    if (arr != NULL)
    {
        cout << "\nDestructor invoked for array of size " << size;
        delete[] arr;
        arr = NULL;
    }
}

void Array::display() const
{
    if (arr != NULL)
    {
        cout << "\nArray elements: ";
        for (int i = 0; i < size; ++i)
        {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
}
