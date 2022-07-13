import java.util.concurrent.ThreadLocalRandom;

public class BankAccount {
    private static int numberOfAccounts = 0;
    private static double totalMoney = 0;
    private long accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    public BankAccount() {
        accountNumber = ThreadLocalRandom.current().nextLong(100000000, 999999999);
        checkingBalance = 0;
        savingsBalance = 0;
        numberOfAccounts++;
    }
    public static int getNumberOfAccounts() {
        return numberOfAccounts;
    }
    public static double getTotalMoney() {
        return totalMoney;
    }
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    public double getAccountNumber() {
        return this.accountNumber;
    }
    /*
        Allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
    */
    public void deposit(double depositAmount, String accountType) {
        if (accountType.equals("checking")) {
            this.checkingBalance += depositAmount;
            totalMoney += depositAmount;
        } 
        if (accountType.equals("savings")) {
            this.savingsBalance += depositAmount;
            totalMoney += depositAmount;
        }
    }
    /*
        Withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    */
    public void withdraw(double withdrawalAmount, String accountType) {
        if (accountType.equals("checking") && this.checkingBalance >= withdrawalAmount) {
            this.checkingBalance -= withdrawalAmount;
            totalMoney -= withdrawalAmount;
        }
        if (accountType.equals("savings") && this.savingsBalance >= withdrawalAmount) {
            this.savingsBalance -= withdrawalAmount;
            totalMoney -= withdrawalAmount;
        }
    }
    /*
        displays the total money from the checking and saving.
    */
    public void displayTotalAccountBalance() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println(this.savingsBalance + this.checkingBalance);
    }


}