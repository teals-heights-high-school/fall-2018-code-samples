//I have $30,000 to save per year and I want to distribute it evenly amongst my different accounts.
//I know that each of these accounts will accrue interest for 30 years
//I know that each investment grows at different rates
//I want to run this program to simulate different scenarios, but I keep having to change the values in multiple places.
//How can we improve my code to be more readable and adaptive to change?

public class RacksOnRacks {

	public static void main(String[] args) {
		double stockInvestments = 0.0;
		double savingsAccount = 0.0;
		double retirementAccount = 0.0;
		for (int year = 1; year <= 30; year++) {
			stockInvestments = stockInvestments + MONTHLY_SAVINGS;
			stockInvestments = stockInvestments * 1.14;
		}
		for (int year = 1; year <= 30; year++) {
			savingsAccount = savingsAccount + 10000;
			savingsAccount = savingsAccount * 1.00001;
		}
		for (int year = 1; year <= 30; year++) {
			retirementAccount = retirementAccount + 10000;
			retirementAccount = retirementAccount * 1.07;
		}
		System.out.println(stockInvestments + savingsAccount + retirementAccount);
	}
}