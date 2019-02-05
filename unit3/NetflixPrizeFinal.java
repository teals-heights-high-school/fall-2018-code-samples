public class NetflixPrizeFinal {
	public static void main(String[] args) {
		double overallAverage = 3.5;
		double userAverage = 3.0;
		double movie1Average = 4.2;
		double movie2Average = 3.2;
		double movie3Average = 3.0;
		double movie4Average = 2.5;
		double estimate1 = computeMovieEstimate(overallAverage, userAverage, movie1Average);
		System.out.println(estimate1);
		double estimate2 = computeMovieEstimate(overallAverage, userAverage, movie2Average);
		System.out.println(estimate2);
		double estimate3 = computeMovieEstimate(overallAverage, userAverage, movie3Average);
		System.out.println(estimate3);
		double estimate4 = computeMovieEstimate(overallAverage, userAverage, movie4Average);
		System.out.println(estimate4);
		System.out.println(computeRootMeanSquareError(estimate1, estimate2, estimate3, estimate4, 4.0, 4.0, 2.0, 3.0));
	}

	public static double computeMovieEstimate(double overallAverage, double userAverage, double movieAverage) {
		return overallAverage + (userAverage - overallAverage) + (movieAverage - overallAverage);
	}

	public static double computeRootMeanSquareError(double estimate1, double estimate2, double estimate3,
			double estimate4, double actual1, double actual2, double actual3, double actual4) {
		double squareErrorSum = 0.0;
		squareErrorSum += Math.pow(estimate1 - actual1, 2);
		squareErrorSum += Math.pow(estimate2 - actual2, 2);
		squareErrorSum += Math.pow(estimate3 - actual3, 2);
		squareErrorSum += Math.pow(estimate4 - actual4, 2);
		return Math.sqrt(squareErrorSum / 4.0);
	}
}