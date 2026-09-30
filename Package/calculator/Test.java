import math.Calculator;

public class Test
{
    public static void main(String[] args)
    {
        int sum = Calculator.add(10, 20);
        int diff = Calculator.subtract(20, 10);

        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + diff);
    }
}