public interface BankInterface
{
    default void BOA(){
        System.out.println("Bank of America (BOA) TRANSACTION");
        System.out.println("amount withdraw to BAC");
        System.out.println("amount deposited BAC");
    }

    default void Chase_bank()
    {
        System.out.println("Chase BANK TRANSACTION");
        System.out.println("amount withdraw to Chase");
        System.out.println("amount deposited to Chase");
    }
    void calculateInterest();

}
