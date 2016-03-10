import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	Account myAccount = new Account(1122, 20000.0, 0.045);

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetId() {
		System.out.println("Id: " + myAccount.getId());
	}

	@Test
	public void testGetBalance() {
		System.out.println("Balance: " + myAccount.getBalance());
	}

	@Test
	public void testGetAnnualInterestRate() {
		System.out.println("AnnualInterestRate: " + myAccount.getAnnualInterestRate());
	}

	@Test
	public void testSetId() {
		Account account = new Account();
		account.setId(1000);
		assertTrue(account.getId() == 1000);
	}

	@Test
	public void testSetBalance() {
		Account account = new Account();
		account.setBalance(2000);
		assertTrue(account.getBalance() == 2000);
	}

	@Test
	public void testSetAnnualInterestRate() {
		Account account = new Account();
		account.setAnnualInterestRate(0.05);
		assertTrue(account.getAnnualInterestRate() == 0.05);
	}

	@Test
	public void testSetDateCreated() {
		java.util.Date dateCreated = new java.util.Date();
		System.out.println("Date Created: " + dateCreated);
	}

	@Test
	public void testGetMonthlyInterestRate() {
		System.out.println("Monthly Interest: " + myAccount.getMonthlyInterestRate());
	}

	@Test
	public void testWithdraw() throws InsufficientFundsException {
		System.out.println("Balance after withdraw $2500: " + myAccount.withdraw(2500));
	}

	@Test
	public void testDeposit() {
		System.out.println("Balance after deposit $3000: " + myAccount.deposit(3000));
	}
	
	@Test(expected = InsufficientFundsException.class)
	public void OverWithdraw() throws Exception {
		double amount = 50000;
		if (amount > myAccount.getBalance()){
			myAccount.withdraw(amount);
		}
	}


}
