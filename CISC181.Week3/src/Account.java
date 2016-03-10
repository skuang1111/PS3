import java.util.Date;

public class Account {
	// Date fields
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	// no-arg constructor
	Account(){
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}
	
	// Constructor with specified id and initial balance
	Account(int newId, double newBalance, double newAnnualInterestRate){
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
	}
	
	// Accessor and mutator methods for id, balance and annaulInterestRate
	public int getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public void setId(int newId){
		id = newId;
	}
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate){
		annualInterestRate = newAnnualInterestRate;
	}
	
	// Accessor method for dateCreated.
	public void setDateCreated(Date newDateCreated){
		dateCreated = newDateCreated;
	}
	
	// Methods
	double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	double withdraw(double amount) throws InsufficientFundsException {
		if (amount > balance){
			throw new InsufficientFundsException(amount);
		}
		return balance -= amount;
	}
	
	double deposit(double amount){
		return balance += amount;
	}
}

