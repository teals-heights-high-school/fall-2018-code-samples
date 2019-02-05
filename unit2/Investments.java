public class Investments {
	public static void main(String[] args) {
		double investments = 0.0;
		int numberOfYears = 35;
		double annualDeposit = 30000.0;
		double annualGrowth = 1.07;
		for (int year = 1; year <= numberOfYears; year++) {
			investments = investments + annualDeposit;
			investments = investments * annualGrowth;
		}
		System.out.println(investments);
	}
}