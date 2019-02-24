
public class SpiralMatrix {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("Given matrix:");
		printMatrix(arr);
		System.out.println("Spiral matrix:");
		printSpiralMatrix(arr);
		
		System.out.println();
		int[][] arr2 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, {13, 14, 15, 16} };
		System.out.println("Given matrix:");
		printMatrix(arr2);
		System.out.println("Spiral matrix:");
		printSpiralMatrix(arr2);
		
	}

	private static void printMatrix(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static void printSpiralMatrix(int[][] arr) {

		int row, col, rowEnd, colEnd;
		row = col = 0;
		rowEnd = arr.length;
		colEnd = arr[0].length;

		while (row < rowEnd && col < colEnd) {
			for (int i = col; i < colEnd; i++) {
				System.out.print(arr[row][i] + " ");
			}
			row++;
			for (int i = row; i < rowEnd; i++) {
				System.out.print(arr[i][colEnd - 1] + " ");
			}
			colEnd--;
			if (row < rowEnd) {
				for (int i = colEnd - 1; i >= col; i--) {
					System.out.print(arr[rowEnd - 1][i] + " ");
				}
				rowEnd--;
			}

			if (col < colEnd) {
				for (int i = rowEnd - 1; i >= row; i--) {
					System.out.print(arr[i][col] + " ");
				}
				col++;
			}
		}
	}
}
