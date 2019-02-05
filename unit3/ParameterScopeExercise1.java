public class ParameterScopeExercise1 {
	// what does the following program print out?
	public static void main(String[] args) {
		int x = 7;
		int y = 8;
		myMethod(y, x);
		System.out.println(x);
	}

	public static void myMethod(int x, int y) {
		x += y;
		System.out.println(x);
		System.out.println(y);
	}
}