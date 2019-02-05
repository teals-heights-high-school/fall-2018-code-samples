public class NestedLoop2 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 7; i >= 4; i--) {
			for (int j = i - 3; j < 5; j++) {
				count++;
			}
		}
		System.out.println(count);
	}
}