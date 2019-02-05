public class TrickyExpressions {
	public static void main(String[] args) {
		int celsius = 100;
		int fahrenheit = celsius * (9 / 5) + 32;
		System.out.println(fahrenheit);

		double anotherCelsiusValue = 100.0;
		double anotherFahrenheitValue = anotherCelsiusValue * (9 / 5) + 32.0;
		System.out.println(anotherFahrenheitValue);

		double drivingThePointHome = 5 / 4;
		System.out.println(drivingThePointHome);

		System.out.println("abc" + 2 + 3);

		System.out.println("abc" + 2.0 + 3);

		System.out.println(2 + 3 + "abc");

		System.out.println("abc" + (2 + 3));

		System.out.println("abc" + 2 * 3);
	}
}