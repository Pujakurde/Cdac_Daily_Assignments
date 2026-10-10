#include <iostream>
using namespace std;

class Array {
private:
    int size;
    int* arr;

public:
    // Default constructor
    Array();

    // Parameterized constructor
    Array(int s);

    // Copy constructor
    Array(const Array& obj);

    // Destructor
    ~Array();

    void display() const;
};
