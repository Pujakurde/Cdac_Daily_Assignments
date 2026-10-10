package setdemo;

import java.util.HashSet;
import java.util.Set;

import setframework.Student;

public class StudentSet {

    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();

        students.add(new Student(23, "Puja", "Pune", 78.5f));
        students.add(new Student(12, "Sakshi", "Mumbai", 82.0f));
        students.add(new Student(67, "Nano", "Banglore", 91.0f));
        students.add(new Student(43, "Goju", "Chennai", 75.0f));
        students.add(new Student(36, "Kavya", "Mumbai", 88.0f));
        students.add(new Student(23, "Khushi", "Pune", 76.5f));
        students.add(new Student(12, "Aarya", "Mumbai", 85.0f));
        students.add(new Student(67, "Gargi", "Pune", 92.0f));
        students.add(new Student(43, "Rucha", "Chennai", 78.0f));
        students.add(new Student(36, "Bhumi", "Mumbai", 89.0f));

        for (Student stu : students) {
        	
            System.out.println(stu);
            System.out.println();
        }

       
    }
}