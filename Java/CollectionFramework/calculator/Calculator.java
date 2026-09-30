package calculator;

public class Calculator <T extends Number> {
	T num1;
	T num2;
	
	public Calculator(T num1, T num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double add() {
		return num1.doubleValue()+num2.doubleValue();
	}


}
