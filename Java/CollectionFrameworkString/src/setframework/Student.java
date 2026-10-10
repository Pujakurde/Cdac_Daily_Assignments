package setframework;

import java.util.Objects;

public class Student {
	private int studentID;
	private String name;
	private String city;
	private float percentage;
	
	public Student()
	{
		
	}

	public Student(int studentID, String name, String city, float percentage) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "StudentID: " + studentID + "\nName: " + name + "\nCity: " + city + "Percentage=" + percentage;
	}

	/*@Override
	public int hashCode() {
		int code=0;
		if (percentage >=90)
			code=10;
		else if(percentage<90 && percentage >=70)
			code=20;
	}*/

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(city, other.city) && Objects.equals(name, other.name)
				&& Float.floatToIntBits(percentage) == Float.floatToIntBits(other.percentage)
				&& studentID == other.studentID;
	}
	
	

}
