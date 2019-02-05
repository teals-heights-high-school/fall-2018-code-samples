public class NestedLoop4 {
	public static void main(String[] args) {
		for (int i = 0; i < 0; i++) {
			for (int j = 0; j < 0; j++) {
				System.out.println(j - i * j);
			}
			System.out.println(i * i + i);
		}
	}
}