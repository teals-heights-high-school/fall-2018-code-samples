public class ParameterScopeExercise4 {
	// what does the following program print out?
	public static void main(String[] args) {
		int x = 7;
		int y = 10;
		myMethod(x, y);
		x -= 2;
		y -= 3;
		myMethod(x, y);
	}

	public static void myMethod(int x, int y) {
		for (int i = x; i <= y; i++) {
			System.out.println(i);
		}
	}
}