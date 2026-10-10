

public class ArithmeticOperation {
	public static void main(String[]args){
		try 
		{
			
			if(args.length<3) 
			{
				throw new ArrayIndexOutOfBoundsException();
			}
			int n1=Integer.parseInt(args[0]);
			int n2=Integer.parseInt(args[1]);
			String operator=args[2];
			int result=0;
			switch(operator){
			case "+":
				result=n1+n2;
				break;
			
			case "-":
				result=n1-n2;
				break;
			
			case "*":
				result=n1*n2;
				break;
			
			case "/":
				result=n1/n2;
				break;
			default:
				System.out.println("Invalid operator");
				return;
			}
			System.out.println("Result: "+result);
				
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Error: Insufficient argument");
			
		}
		catch(NumberFormatException e){
			System.out.println("Error: First 2 numbers should be valid");
			
		}
		catch(ArithmeticException e) {
			System.out.println("Error: cannot divide by 0");
		
		}
		
	}

}
