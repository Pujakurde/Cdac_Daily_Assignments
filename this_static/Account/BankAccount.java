class BankAccount
{
	//data members - non-static/instance data members
    private int accno;
    private double balance;
	private static float interest_rate;
	
	static
	{
		System.out.println("In static block of bank account");
		interest_rate = 7.25f;
	}
	public BankAccount() 
	{
		accno=0;
		balance=0.0f;

    }

    public BankAccount(int accno, double balance) 
	{
	 this.accno = accno;
	 this.balance = balance;
    }
	
	
	void display()
	{
		System.out.println("Account Number: "+accno);
		System.out.println("Account Balance: "+balance);
		System.out.println("Account Interest Rate: "+interest_rate+"%");
	}
	public static void updateInterestate(float newRateofInterest)
	{
	 interest_rate = newRateofInterest;
    }
	void calInterest()
	{
		double interest=balance*interest_rate/100;
		balance=balance+interest;
		return balance;
	}
}
	