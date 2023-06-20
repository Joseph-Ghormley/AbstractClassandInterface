public class Main
{
    public static void main(String[] args)
    {

        PNC pncAccount = new PNC();
        System.out.println("PNC BANK TRANSACTION");
        pncAccount.deposit(); // Depositing into PNC account
        pncAccount.withdraw(); // Withdrawing from PNC account
        pncAccount.calculateInterest(); // Calculating interest for PNC account
        System.out.println();

        AMT amtAccount = new AMT();
        System.out.println("AMT BANK TRANSACTION");
        amtAccount.deposit(); // Depositing into AMT account
        amtAccount.withdraw(); // Withdrawing from AMT account
        amtAccount.calculateInterest(); // Calculating interest for AMT account
        System.out.println();

        BankInterface boaAccount = new BOA();
        boaAccount.BOA();
        boaAccount.calculateInterest();
        System.out.println();

        BankInterface chaseAccount = new Chase_Bank();
        chaseAccount.Chase_bank();
        chaseAccount.calculateInterest();






    }
}
