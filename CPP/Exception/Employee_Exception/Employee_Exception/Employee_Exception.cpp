#include "Employee_Exception.h"
#include <cstring>
#include<cctype>

Employee_Exception::Employee_Exception()
{
	id = 0;
	Ename[0] = '\0';
	salary = 0.0f;
}

Employee_Exception::Employee_Exception(int id, const char* Ename, float salary)
{
	this->id = id;
	strcpy_s(this->Ename, sizeof(this->Ename), Ename);
	this->salary = salary;
}
bool Employee_Exception::accept()
{
    try
    {
        cout << "Enter Employee ID: ";
        cin >> id;

        if (cin.fail() || id < 0)
        {
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
            throw 10;
        }

        cout << "Enter Employee Name: ";
        cin >> Ename;

        for (int i = 0; Ename[i] != '\0'; i++)
        {
            if (!isalpha(static_cast<unsigned char>(Ename[i])))
                throw "Invalid Employee Name";
        }

        cout << "Enter Employee Salary: ";
        cin >> salary;

        if (cin.fail() || salary < 0)
        {
            cin.clear();
            cin.ignore(numeric_limits<streamsize>::max(), '\n');
            throw 10.0f;
        }

        return true;
    }

    catch (int)
    {
        cout << "Invalid input for Employee ID. Please enter a valid integer."
            << endl;
    }

    catch (const char*)
    {
        cout << "Invalid input for Employee Name. Please enter a valid name."
            << endl;
    }

    catch (float)
    {
        cout << "Invalid input for Employee Salary. Please enter a valid salary."
            << endl;
    }

    catch (...)
    {
        cout << "Unknown exception." << endl;
    }

    return false;
}

	void Employee_Exception::display()
	{

		cout << "Employee ID: " << id << endl;
		cout << "Employee Name: " << Ename << endl;
		cout << "Employee Salary: " << salary << endl;

	}
	


