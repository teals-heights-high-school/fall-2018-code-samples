public class UnitExamPracticeCelsius1Refactored {
	public static void main(String[] args) {
		double fahrenheit1 = convertCelsiusToFahrenheit(88.0);
		double fahrenheit2 = convertCelsiusToFahrenheit(67.2);
		double fahrenheit3 = convertCelsiusToFahrenheit(99.0);
		double average = average(fahrenheit1, fahrenheit2, fahrenheit3);
		System.out.println(average);
	}

	public static double convertCelsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5.0) * celsius + 32;
		return fahrenheit;
	}

	public static double average(double number1, double number2, double number3) {
		double average = (number1 + number2 + number3) / 3;
		return average;
	}
}