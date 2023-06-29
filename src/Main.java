public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Transaction Details Using Abstract Class");
        System.out.println("------------------------------------------");
        System.out.println("PNC BANK TRANSACTION");
        Bank bank = new PNC();
        bank.deposit();
        bank.withdraw();
        bank.calculateInterest();
        System.out.println("--------------------------------");
        System.out.println("AMT BANK TRANSACTION");
        bank = new AMT();
        bank.deposit();
        bank.withdraw();
        bank.calculateInterest();
        System.out.println("------------------------------------------");
        System.out.println("End of Abstract Class");
        System.out.println("------------------------------------------");
        System.out.println("Transaction Details Using INTERFACE");
        System.out.println("------------------------------------------");
        BankInterface b1 = new BOA();
        b1.deposite();
        b1.withdraw();
        b1.calculateInterest();
        System.out.println("------------------------------------------");
        System.out.println("Chase BANK TRANSACTION");
        b1 = new Chase();
        b1.deposite();
        b1.withdraw();
        b1.calculateInterest();
        System.out.println("---------------------------------");
        System.out.println("End of INTERFACE");
        System.out.println("------------------------------------------");
    }
}
