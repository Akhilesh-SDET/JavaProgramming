package OOPSConcepts.Encapsulation;

/*
 * Withdraw will be allowed only when:
    The correct PIN is entered
    There is sufficient balance in the account
  Balance will be displayed only when the correct PIN is entered.
  PIN can be changed only when the old PIN is entered correctly.
 */

public class A003_BankAccount {
	private static int count = 1001;

	private String accountHolderName;
	private int accountNumber;
	private double balance;
	private int pin;

	public A003_BankAccount(String name, double initialDeposit, int pin) {

		// Name validation
		if (name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name cannot be null or empty");
		}

		// Initial deposit validation
		if (initialDeposit < 0) {
			throw new IllegalArgumentException("Initial deposit cannot be negative");
		}

		// PIN validation (exactly 4 digits)
		if (pin < 1000 || pin > 9999) {
			throw new IllegalArgumentException("PIN must be exactly 4 digits");
		}

		this.accountHolderName = name;
		this.balance = initialDeposit;
		this.pin = pin;

		// Auto-generate account number
		this.accountNumber = count++;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Balance should be greater than zero");
		}
		this.balance = balance + amount;
	}

	public void withdraw(double amount, int enteredPin) {

		if (amount <= 0) {
			throw new IllegalArgumentException("Withdraw amount must be greater than zero");
		}

		if (enteredPin != pin) {
			throw new IllegalArgumentException("Incorrect PIN");
		}

		if (amount > balance) {
			throw new IllegalArgumentException("Insufficient Balance");
		}

		balance -= amount;
	}

}
