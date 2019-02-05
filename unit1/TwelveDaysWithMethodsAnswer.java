public class TwelveDaysWithMethodsAnswer {
	public static void main(String[] args) {
		printVerseOne();
		printVerseTwo();
		printVerseThree();
	}

	public static void printVerseOne() {
		System.out.println("On the first day of Christmas, my true love gave to me");
		printAPartrigeInAPearTree();
	}

	public static void printVerseTwo() {
		System.out.println("On the second day of Christmas, my true love gave to me");
		printTwoTurtleDoves();
		printAPartrigeInAPearTree();
	}

	public static void printVerseThree() {
		System.out.println("On the second day of Christmas, my true love gave to me");
		printThreeFrenchHens();
		printTwoTurtleDoves();
		printAPartrigeInAPearTree();
	}

	public static void printAPartrigeInAPearTree() {
		System.out.println("A partridge in a pear tree");
	}

	public static void printTwoTurtleDoves() {
		System.out.println("Two turtle doves, and");
	}

	public static void printThreeFrenchHens() {
		System.out.println("Three French hens");
	}

	public static void printFourCollyBirds() {
		System.out.println("Four colly birds");
	}
}