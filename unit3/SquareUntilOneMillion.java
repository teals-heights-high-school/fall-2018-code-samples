public class SquareUntilOneMillion {
	public static void main(String[] args) {
		int number = 4;
		// changed to 1000 due to integer limitations
		while (number <= 1000) {
			number = number * number;
			System.out.println(number);
		}
	}
}