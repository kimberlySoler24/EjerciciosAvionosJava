package kimberly.code.programacionBasica;

import java.util.Arrays;
import java.util.Iterator;
import java.util.HashSet;

public class Arreglos {

	// Write a function histogram(int[]), that takes an array of positive numbers,
	// stats,
	// and create a vertical histogram, a String which row i-th has a number of *
	// equals to
	// stats[i].

	public static String histogram(int[] array) {
		var builder = new StringBuilder();
		for (var i = 0; i < array.length; i++) {
			builder.append("*".repeat(array[i])).append(System.lineSeparator());
		}
		return builder.toString();
	}

	// Write a function that given an int of arrays returns the max number in it.

	public static int max(int[] maxNumber) {
		var order = Arrays.copyOf(maxNumber, maxNumber.length);
		Arrays.sort(order);
		return order[order.length - 1];
	}

	// Given an array of numbers ranging from 0 to 5, return an array of numbers
	// with the
	// info of how many of each digit were in the array. For example, say that you
	// start
	// from the array {0, 1, 2, 3, 2, 0, 5, 1, 2}, so there’s two 0’s, two 1’s,
	// three 2’s,
	// one 3, zero 4’s and one 5. Now treat the index of the array as a number in
	// the array
	// and put in that position how the count for that number, so the resulting
	// array should
	// be { 2, 2, 3, 1, 0, 1 }: there’s a 2 in position 0 because there were two 0’s
	// in the
	// original array, etc

	public static int[] stats(int[] arrays) {
		var arraysResult = new int[6];
		for (var i = 0; i < arraysResult.length; i++) {
			var count = 0;
			for (var j = 0; j < arrays.length; j++) {
				if (arrays[j] == i) {
					count += 1;
				}
				arraysResult[i] = count;
			}
		}
		return arraysResult;
	}

	// Create a function that, given the dimensions of a matrix returns a matrix
	// with each cell being a positive number in ascending order form
	// top to bottom, left to right starting with 1.

	public static String numericMatrix(int row, int col) {
		var builder = new StringBuilder();
		var sum = 0;
		var result = new int[row][col];
		for (var r = 0; r < row; ++r) {
			builder.append("[");
			for (var c = 0; c < col; ++c) {
				sum += 1;
				builder.append(Integer.toString(result[r][c] = sum));
			}
			builder.append("]").append(System.lineSeparator());
		}
		return builder.toString();
	}

	// Create a function that, given the dimensions of a square matrix, returns a
	// matrix with '0' in all cells,
	// except cells on the main diagonal with a 1. The main diagonal is a cell that
	// shares an index for its row
	// and column. For example on square matrix m of size 3, then there's a '1' on
	// m[0][0], m[1][1] and m[2][2].

	public static String identify(int number) {
		var builder = new StringBuilder();
		var result = new int[number][number];
		for (var i = 0; i < number; i++) {
			builder.append("[");
			for (int j = 0; j < number; j++) {
				if (i == j) {
					builder.append(Integer.toString(result[i][j] = 1));
				} else {
					builder.append(Integer.toString(result[i][j] = 0));
				}

			}
			builder.append("]").append(System.lineSeparator());
		}
		return builder.toString();
	}

//		Create a function that given a matrix with only two characters: ' ' and '*' returns a new matrix where each 
//		cell that shares a row or column with a cell that has a '*' is a '.' character instead but only if in the original
//		matrix there wasn't a '*'. For example if the matrix is:
	
	private static int [] FoundChar (char[][] matrix) {
		var array = new int [4];
//		HashSet<Integer> array = new HashSet<Integer>();
		var index = 0;
		var index1 = 1;
//		HashSet <Integer> pos= new HashSet <> ();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == '*') {
//					pos.add(i);
//					pos.add(j);
					array[index] = i;
					array[index1] = j;
					index += 2;
					index1 += 2;
					}
				}
			}
		return array;
	}

	public static String expandingMatrix(char[][] matrix) {
		var builder = new StringBuilder ();
		var array =  FoundChar(matrix);
		var newMatrix = new char[3][3];
		for (int i = 0; i < newMatrix.length; i++) {
			builder.append('[');
			for (int j = 0; j < newMatrix.length; j++) {	
						if (i == array[0] || j == array[1]) {
							if ( i == array[0] && j == array[1]) {
								builder.append(newMatrix [i][j]='*');
							}
							else {
								builder.append(newMatrix [i][j]='.');
							}
						} else {
							builder.append(newMatrix [i][j] = ' ');
						}
				}
			builder.append(']').append(System.lineSeparator());
			}
		return builder.toString();
	}
	
// hallar la cuadratica de una función	

	  public static double discriminante(double a, double b, double c) {
	        return b*b - 4*a*c;
	    }
	

	public static double[] quadratic(double a, double b, double c) {
        double discriminante = discriminante(a, b, c);
        if (discriminante < 0) {
            return new double[0];
        } else if (discriminante == 0) {
            var value = new double [] {-b/2*a};
            return value;
        } else {
            var raiz = Math.sqrt(discriminante);
            var raiz1 = (-b + raiz)/(2*a);
            var raiz2 = (-b - raiz)/(2*a);
            var raices = new double[] {raiz1, raiz2};
            return raices;
        }

    }

}
