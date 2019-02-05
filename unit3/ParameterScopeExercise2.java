public class ParameterScopeExercise2 {
	// what does the following program print out?
	public static void main(String[] args) {
		String aSentence = "This is a dummy sentence.";
		int numberOfWords = 5;
		printWordCountWithSentence(numberOfWords, aSentence);
	}

	public static void printWordCountWithSentence(String sentence, int wordCount) {
		System.out.println("There are " + wordCount + " words in the following sentence: " + sentence);
	}
}