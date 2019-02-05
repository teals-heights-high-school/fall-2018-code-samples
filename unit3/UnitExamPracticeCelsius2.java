public class UnitExamPracticeCelsius2 {
	// does this program compile?
	// does this program produce the right output?
	public static void main(String[] args) {
		convertCelsiusToFahrenheit(88.0, 67.2, 99.0);
		average();
	}

	// what are the implications of using a return type of void here?
	// what are we doing with the values that we've converted?
	public static void convertCelsiusToFahrenheit(double celsius1, double celsius2, double celsius3) {
		double fahrenheit1 = (9.0 / 5.0) * celsius1 + 32;
		double fahrenheit2 = (9.0 / 5.0) * celsius2 + 32;
		double fahrenheit3 = (9.0 / 5.0) * celsius3 + 32;
	}

	// what are the implications of using a return type of void here?
	// should the average method print out the answer?
	public static void average(double number1, double number2, double number3) {
		double average = (number1 + number2 + number3) / 3;
		System.out.println(average);
	}
}