#include <iostream>
using namespace std;

// Area of circle
float area(float r)
{
    return 3.14 * r * r;
}

// Area of rectangle
float area(float l, float b)
{
    return l * b;
}

// Area of triangle
float area(float b, float h, bool triangle)
{
    return 0.5 * b * h;
}

int main()
{
    float r, l, b, h;

    cout << "Enter radius of circle: ";
    cin >> r;
    cout << "Area of Circle = " << area(r) << endl;

    cout << "Enter length and breadth of rectangle: ";
    cin >> l >> b;
    cout << "Area of Rectangle = " << area(l, b) << endl;

    cout << "Enter base and height of triangle: ";
    cin >> b >> h;
    cout << "Area of Triangle = " << area(b, h, true) << endl;

    return 0;
}
