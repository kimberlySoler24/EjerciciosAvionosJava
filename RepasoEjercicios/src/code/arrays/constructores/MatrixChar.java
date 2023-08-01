package code.arrays.constructores;

import java.util.Arrays;

public class MatrixChar {
	
	//ATRIBUTO
	private char matrix [][];
	
	//CONSTRUCTOR
	public MatrixChar (char matrix [][]) {
		this.matrix = matrix;
	}
	
	//METODOS
	public char [][]matrix() {
		return matrix;
	}
	
	public char[][] expandingMatrix(){
		var positionOfAsteriskI = 0;
		var positionOfAsteriskJ = 0;
		var copyMatrix = Arrays.copyOf(matrix, matrix.length);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == '*') {
					positionOfAsteriskI = i;
					positionOfAsteriskJ = j;
					for (int row = 0; row < copyMatrix.length; row++) {
						for (int col = 0; col < copyMatrix[row].length; col++) {
							if (matrix[row][col] == '*') {
								copyMatrix[row][col] = '*';
							} else {
								if (row == positionOfAsteriskI) {
									copyMatrix[positionOfAsteriskI][col] = '.';
								} else if (col == positionOfAsteriskJ) {
									copyMatrix[row][positionOfAsteriskJ] = '.';
								}
							}
						}
					}
				}
			}
		}
		return copyMatrix;
	}
	
	
	public String toStrings(MatrixChar matrix4) {
		var matrixToSee = expandingMatrix();
		var builder = new StringBuilder();
		for (char[] fila : matrixToSee) {
			builder.append('[');
			for (char columna : fila) {
				builder.append(columna);
			}
			builder.append(']').append(System.lineSeparator());
		}
		return builder.toString();
	}
	
	
}
