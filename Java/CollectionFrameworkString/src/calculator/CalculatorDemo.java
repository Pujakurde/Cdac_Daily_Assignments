package calculator;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator <Integer> cal = new Calculator(10,20);
		System.out.println("Addition of Intger values: "+ cal.add());
		
		Calculator <Double> cal1 = new Calculator(10.0,20.5);
		System.out.println("Addition of Float Values: "+ cal1.add());

	}

}
