import java.util.Scanner;

public class ScannerSentinel {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int userInput = 0;
		while (userInput != -1) {
			userInput = scanner.nextInt();
			if (userInput == -1) {
				System.out.println("Done!");
			} else {
				System.out.println(userInput);
			}
		}
		scanner.close();
	}
}