public class ReferenceSemantics {
	public static void main(String[] args) {
		int number = 6;
		int[] numbers = new int[2];
		numbers[0] = 1;
		numbers[1] = 2;
		updateNumber(number);
		updateNumberArray(numbers);
		System.out.println(number);
		for (int index = 0; index < numbers.length; index++) {
			System.out.println(numbers[index]);
		}
	}

	public static void updateNumber(int number) {
		// this number is a copy that is thrown away
		// unless it's returned
		number++;
		System.out.println(number);
	}

	public static void updateNumberArray(int[] numbers) {
		// this array is the same array from the main method
		// changes to arrays inside of methods impact the array from the caller method
		numbers[0] = 7;
		numbers[1] = 8;
	}
}