package office;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeDemo {
	public static void main(String[]args) throws Exception{
		BufferedReader br=new BufferedReader(new FileReader("D:/java/JavaWorkspace/Streamapi/src/office/empcsvdata.txt"));
		List<Employee> emp= br.lines()
		.map(line->line.split(","))
		.map(a->new Employee(
				Integer.parseInt(a[0]),
				a[1],
				a[2],
				Double.parseDouble(a[3]),a[4]))
		.collect(Collectors.toList());
		
		emp.stream().forEach(System.out::println);
		
	}

}
