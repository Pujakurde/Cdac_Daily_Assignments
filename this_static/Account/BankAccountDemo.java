class BankAccountDemo
{
    public static void main(String[] args)
    {
        BankAccount b1 = new BankAccount(101, 1234567);

        System.out.println("Before Interest:");
        b1.display();

        b1.calInterest();

        System.out.println("\nAfter Interest:");
        b1.display();

        BankAccount.updateInterestate(8.5f);
        b1.calInterest();

        System.out.println("\nAfter changing interest rate:");
        b1.display();
    }
}