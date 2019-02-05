public class MultidimensionalArrayExample {
	public static void main(String[] args) {
		int[][] twoDimensionalArray = new int[5][5];
		twoDimensionalArray[0][0] = 1;
		twoDimensionalArray[1][1] = 1;
		twoDimensionalArray[2][2] = 1;
		twoDimensionalArray[3][3] = 1;
		twoDimensionalArray[4][4] = 1;
		for (int row = 0; row < twoDimensionalArray.length; row++) {
			for (int column = 0; column < twoDimensionalArray[0].length; column++) {
				System.out.print(twoDimensionalArray[row][column]);
			}
			System.out.println();
		}
	}
}