#include <iostream>
#include <string>
#include <fstream>
using namespace std;
namespace Trainer
{
	class Trainer
	{
		int id;
		string name;
	public:
		Trainer(int i, string n)
		{
			id = i;
			name = n;
		}
		int getid()
		{
			return id;
		}
		string getName()
		{
			return name;
		}
		void show()
		{
			cout << "Trainer id: " << id << endl;
			cout << "\nTrainer name: " << name << endl;
		}

	};
	void writeData(Trainer t)
	{
		ofstream fout("Trainer.txt");
		if (!fout)
		{
			cout << "Unable to open Trainer.txt";
		}
		else
		{
			fout<<t.getid();
			fout << t.getName();
			fout.close();
		}
	}
	void readData()
	{
		ifstream fin("Trainer.txt");
		if (fin.fail())
		{
			cout << "\nFile not found...";
			exit(0);
		}
		else
		{
			string line;
			while (getline(fin, line))
			{
				cout << line << endl;
			}
			fin.close();
		}
	}
}

namespace Student
{
	class Student
	{
		int id;
		string name;
	public:
		Student(int i, string n)
		{
			id = i;
			name = n;
		}
		int getid()
		{
			return id;
		}
		string getName()
		{
			return name;
		}
		void show()
		{
			cout << "Student id: " << id << endl;
			cout << "\nStudent name: " << name << endl;
		}

	};
	void writeData(Student t)
	{
		ofstream fout("Student.txt");
		if (!fout)
		{
			cout << "Unable to open Student.txt";
		}
		else
		{
			fout << t.getid();
			fout << t.getName();
			fout.close();
		}
	}
	void readData()
	{
		ifstream fin("Student.txt");
		if (fin.fail())
		{
			cout << "\nFile not found...";
			exit(0);
		}
		else
		{
			string line;
			while (getline(fin, line))
			{
				cout << line << endl;
			}
			fin.close();
		}
	}
}
int main()
{
	Trainer::Trainer t1(202,"Puja");
	t1.show();
	Trainer::writeData(t1);
	Trainer::readData();
	
	Student::Student s1(202, "Puja");
	s1.show();
	Student::writeData(s1);
	Student::readData();
	return 0;
}