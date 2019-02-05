public class ParameterScopeExercise3 {
	// what does the following program print out?
	public static void main(String[] args) {
        int numberOfWords = 5;
        printWordCountWithSentence(This is a dummy sentence, 5);
    }

	public static void printWordCountWithSentence(String sentence, int wordCount) {
		System.out.println("There are " + wordCount + " words in the following sentence: " + sentence);
	}
}