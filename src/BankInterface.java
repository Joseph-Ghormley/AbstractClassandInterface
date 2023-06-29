public interface BankInterface
{
   default void withdraw()
    {
        System.out.print("amount withdraw");
    }
    default void deposite()
    {
        System.out.print("amount deposited");
    }
    void calculateInterest();

}
