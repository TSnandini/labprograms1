package activity;

class BankAccount 
{

	    private String accountNumber;
	    private double balance;
	    private String accountHolderName;

	    public BankAccount(String accountNumber, double balance, String accountHolderName) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	        this.accountHolderName = accountHolderName;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	    }

	    public void withdraw(double amount) {
	        if (amount > balance) {
	            System.out.println("Insufficient funds");
	        } else {
	            balance -= amount;
	        }
	    }

	    public void displayBalance() {
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Account Number: " + accountNumber);
	        System.out.println("Balance: " + balance);
	    }

	    public static void main(String[] args) {
	       
	        BankAccount account1 = new BankAccount("123456789", 1000, "Nandini");
	        System.out.println("Account Holder: " + account1.getAccountHolderName());
	        System.out.println("Account Number: " + account1.getAccountNumber());
	        System.out.println("Balance: " + account1.getBalance());

	       
	        account1.deposit(500);
	        account1.withdraw(200);
	        account1.displayBalance();
	    }

	   
	    public String getAccountNumber() {
	        return accountNumber;
	    }

	    public void setAccountNumber(String accountNumber) {
	        this.accountNumber = accountNumber;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public String getAccountHolderName() {
	        return accountHolderName;
	    }
	    public void setAccountHolderName(String accountHolderName) {
	        this.accountHolderName = accountHolderName;
	    }


}

