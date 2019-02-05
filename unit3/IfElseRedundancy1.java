public class IfElseRedundancy1 {
	public static void main(String[] args) {
		int x = 25;
		int a = 0;
		if (x < 30) {
			a = 2;
			x++;
			System.out.println("x is " + x);
			System.out.println(a);
		} else {
			a = 2;
			System.out.println("x is " + x);
			System.out.println(a);
		}
	}
}