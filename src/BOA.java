public class BOA implements BankInterface
{
  @Override
  public void calculateInterest()
  {
      System.out.println("The interest rate is 5%");
  }

  @Override
    public void deposite()
  {
      BankInterface.super.deposite();
      System.out.println(" to BAC");
  }

  @Override
    public void withdraw()
  {
      BankInterface.super.withdraw();
      System.out.println(" from BAC");
  }

}
