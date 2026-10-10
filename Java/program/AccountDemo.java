class BankAccount
{
	//data members - non-static/instance data members
    private int accno;
    private double balance;
	static float interest_rate;
	
	public BankAccount() {

    }

    public BankAccount(int accno, double balance) 
	{
	 this.accno = accno;
	 this.balance = balance;
    }
	
	static
	{
		System.out.println("In static block of bank account");
		interest_rate = 7.25f;
	}
	public static void updateInterestate(float newRateofInterest)
	{
	 interest_rate = newRateofInterest;
    }
	
	