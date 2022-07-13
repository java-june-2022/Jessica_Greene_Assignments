public class TestBankAccount {
    public static void main(String[] args) {
        //Create Bank Account
        BankAccount account1 = new BankAccount();
        System.out.println("Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Savings Balance: " + account1.getSavingsBalance());
        
        //Deposit into checking
        account1.deposit(5000, "checking");
        System.out.println("Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Savings Balance: " + account1.getSavingsBalance());
        
        //Deposit into savings
        account1.deposit(1000, "savings");
        System.out.println("Checking Balance: " + account1.getCheckingBalance());
        System.out.println("Savings Balance: " + account1.getSavingsBalance());

        //Display total account balance
        account1.displayTotalAccountBalance();

        System.out.println(BankAccount.getNumberOfAccounts());
        System.out.println(BankAccount.getTotalMoney());
    }
}