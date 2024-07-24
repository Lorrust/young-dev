package intro.matrix;

public class MatrixExample {
	
	public static void main(String[] args) {
		
		int[][] matrix1 = new int[4][4];		
		
		matrix1[0][0] = 1;
		matrix1[0][1] = 2;
		matrix1[0][2] = 3;
		matrix1[0][3] = 4;
		
		matrix1[1][0] = 5;
		matrix1[1][1] = 6;
		matrix1[1][2] = 7;
		matrix1[1][3] = 8;
		
		matrix1[2][0] = 9;
		matrix1[2][1] = 10;
		matrix1[2][2] = 11;
		matrix1[2][3] = 12;
		
		matrix1[3][0] = 13;
		matrix1[3][1] = 14;
		matrix1[3][2] = 15;
		matrix1[3][3] = 16;
		
//		Show matrix in original format
		
		for (int i = 0; i < matrix1.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.print(matrix1[i][j] + "\t");
			}
		}
		
//		Sum rows
		
		for (int i = 0; i < matrix1.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < matrix1[i].length; j++) {
				rowSum += matrix1[i][j];
			}
			System.out.println("\n\nRow " + (i + 1) + " sum: " + rowSum);
		}
		
//		Sum rows
		
		System.out.println("Row sums");
			
//		Sum main diagonal
		
		int diagonalSum = 0;
		for (int i = 0; i < matrix1.length; i++) {
			diagonalSum += matrix1[i][i];
		}
		System.out.println(diagonalSum);
		
		}
	}
