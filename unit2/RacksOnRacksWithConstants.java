public class RacksOnRacksWithConstants {

	public static final int NUMBER_OF_YEARS_WORKED = 30;
	public static final double ANNUAL_DEPOSIT = 30000.0;

	public static void main(String[] args) {
		double stockInvestments = 0.0;
		double savingsAccount = 0.0;
		double retirementAccount = 0.0;
		for (int year = 1; year <= NUMBER_OF_YEARS_WORKED; year++) {
			stockInvestments = stockInvestments + (ANNUAL_DEPOSIT / 3.0);
			stockInvestments = stockInvestments * 1.14;
		}
		for (int year = 1; year <= NUMBER_OF_YEARS_WORKED; year++) {
			savingsAccount = savingsAccount + (ANNUAL_DEPOSIT / 3.0);
			savingsAccount = savingsAccount * 1.00001;
		}
		for (int year = 1; year <= NUMBER_OF_YEARS_WORKED; year++) {
			retirementAccount = retirementAccount + (ANNUAL_DEPOSIT / 3.0);
			retirementAccount = retirementAccount * 1.07;
		}
		System.out.println(stockInvestments + savingsAccount + retirementAccount);
	}
}