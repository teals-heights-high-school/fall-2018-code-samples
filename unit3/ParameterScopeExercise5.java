public class ParameterScopeExercise5 {
	// what does the following program print out?
	public static void main(String[] args) {
		int x = 7;
		int y = 10;
		myMethod(x, y, 4);
		x -= 2;
		y -= 3;
		myMethod(x, y, 2);
	}

	public static void myMethod(int x, int y, int z) {
		for (int i = x; i <= y; i++) {
			for (int j = 0; j <= z; j++) {
				System.out.print(z);
			}
			System.out.println(x);
		}
	}
}