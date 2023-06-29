public class Chase implements BankInterface
{
    @Override
    public void calculateInterest()
    {
        System.out.println("The interest rate is 10%");
    }
    @Override
    public void deposite()
    {
        BankInterface.super.deposite();
        System.out.println(" to Chase");
    }

    @Override
    public void withdraw()
    {
        BankInterface.super.withdraw();
        System.out.println(" from Chase");
    }

}
