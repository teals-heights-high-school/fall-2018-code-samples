public class Working {
	public static void main(String[] args) {
		int grade = 62;
		if (grade >= 70) {
			System.out.println("You passed!");
			if (grade >= 90) {
				if (grade >= 95) {
					System.out.println("You got an A+!");
				} else {
					System.out.println("You got an A!");
				}
			} else if (grade >= 80) {
				System.out.println("You got a B!");
			} else {
				System.out.println("You got a C!");
			}
		} else {
			System.out.println("Please see me after class");
			if (grade >= 60) {
				System.out.println("You got a D...");
			} else {
				System.out.println("You got an F...");
			}
		}
	}
}