public class ArrayIterationExample {
	public static void main(String[] args) {
		// initialize array of size 10 (valid indexes are 0-9)
		int[] integerArray = new int[10];

		// set some values
		integerArray[2] = 12;
		integerArray[3] = 46;
		integerArray[9] = 100;

		// iterate through an array
		for (int index = 0; index < integerArray.length; index++) {
			System.out.println(integerArray[index]);
		}
	}
}