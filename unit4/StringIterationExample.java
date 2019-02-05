public class StringIterationExample {
	public static void main(String[] args) {
		String helloWorld = "Hello, world!";

		// iterate through characters
		for (int index = 0; index < helloWorld.length(); index++) {
			char currentCharacter = helloWorld.charAt(index);
			System.out.println(currentCharacter);
		}
	}
}